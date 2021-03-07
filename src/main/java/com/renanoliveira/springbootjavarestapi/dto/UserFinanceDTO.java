package com.renanoliveira.springbootjavarestapi.dto;

import com.renanoliveira.springbootjavarestapi.domain.Address;
import com.renanoliveira.springbootjavarestapi.domain.UserFinance;

import java.io.Serializable;

public class UserFinanceDTO implements Serializable {

    private String id;

    private String document;

    private String name;

//    private List<Debt> debts;

    private Address address;

    private Integer age;

//    private List<Patrimony> patrimonies;

//    private List<SourceIncome> incomeSources;


    public UserFinanceDTO() {
    }

    public UserFinanceDTO(UserFinance userFinance) {

        id = userFinance.getId();
        document = userFinance.getDocument();
        name = userFinance.getName();
        age = userFinance.getAge();
        address = userFinance.getAddress();

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
