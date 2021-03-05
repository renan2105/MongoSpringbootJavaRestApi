package com.renanoliveira.springbootjavarestapi.domain;

import java.io.Serializable;
import java.util.List;

public class UserFinance implements Serializable {

    private String id;

    private String document;

    private String name;

    private List<Debt> debts;

//    private Address address;

    private Integer age;

    private List<Patrimony> patrimonies;

    private List<SourceIncome> incomeSources;


    public UserFinance() {
    }

    public UserFinance(String id, String document, String name, List<Debt> debts,  Integer age, List<Patrimony> patrimonies, List<SourceIncome> incomeSources) {
        this.id = id;
        this.document = document;
        this.name = name;
        this.debts = debts;
//        this.address = address;
        this.age = age;
        this.patrimonies = patrimonies;
        this.incomeSources = incomeSources;
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

    public List<Debt> getDebts() {
        return debts;
    }

    public void setDebts(List<Debt> debts) {
        this.debts = debts;
    }

//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Patrimony> getPatrimonies() {
        return patrimonies;
    }

    public void setPatrimonies(List<Patrimony> patrimonies) {
        this.patrimonies = patrimonies;
    }

    public List<SourceIncome> getIncomeSources() {
        return incomeSources;
    }

    public void setIncomeSources(List<SourceIncome> incomeSources) {
        this.incomeSources = incomeSources;
    }


    //
//    "id": String,
//            "document": Integer,
//            "name": String,
//            "debts": [
//    {
//        "originDebt": String,
//            "valueDebt": Double
//    }
//	],
//            "address":{
//        "street": String,
//                "district": String,
//                "city": String,
//                "state": String,
//                "country": String,
//                "complement": String
//    },
//
//            "age": Integer,
//            "patrimony":[
//    {
//        "type": ENUM"CAR|PROPERTIES",
//            "patrimonyName": String,
//            "patrimonyValue": Double,
//    }
//	],
//            "sourcesIncome": [
//    {
//        "originSourceIncome": String,
//            "destinationSourceIncome": String,
//            "valueSourceIncome": Double
//    }
//	],

}
