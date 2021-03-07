package com.renanoliveira.springbootjavarestapi.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document
public class UserFinance implements Serializable {

    @Id
    private String id;

    private String document;

    private String name;

//    private List<Debt> debts;

    private Address address;

    private Integer age;

//    private List<Patrimony> patrimonies;

//    private List<SourceIncome> incomeSources;


    public UserFinance() {
    }

    public UserFinance(String id, String document, String name, Address address, Integer age) {
        this.id = id;
        this.document = document;
        this.name = name;
        this.address = address;
        this.age = age;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
