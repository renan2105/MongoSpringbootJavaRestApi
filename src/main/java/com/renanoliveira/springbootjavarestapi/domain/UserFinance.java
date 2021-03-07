package com.renanoliveira.springbootjavarestapi.domain;

import com.renanoliveira.springbootjavarestapi.dto.AddressDTO;
import com.renanoliveira.springbootjavarestapi.dto.DebtDTO;
import com.renanoliveira.springbootjavarestapi.dto.PatrimonyDTO;
import com.renanoliveira.springbootjavarestapi.dto.SourceIncomeDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document
public class UserFinance implements Serializable {

    @Id
    private String id;

    private String document;

    private String name;

    private List<DebtDTO> debts = new ArrayList<>();

    private AddressDTO address;

    private Integer age;

    private List<PatrimonyDTO> patrimonys = new ArrayList<>();

    private List<SourceIncomeDTO> sourceIncomes = new ArrayList<>();


    public UserFinance() {
    }

    public UserFinance(String id, String document, String name, AddressDTO address, Integer age) {
        this.id = id;
        this.document = document;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public UserFinance(String id, String document, String name, List<DebtDTO> debts, AddressDTO address, Integer age, List<PatrimonyDTO> patrimonys, List<SourceIncomeDTO> incomeSources) {
        this.id = id;
        this.document = document;
        this.name = name;
        this.debts = debts;
        this.address = address;
        this.age = age;
        this.patrimonys = patrimonys;
        this.sourceIncomes = incomeSources;
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

    public List<DebtDTO> getDebts() {
        return debts;
    }

    public void setDebts(List<DebtDTO> debts) {
        this.debts = debts;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<PatrimonyDTO> getPatrimonys() {
        return patrimonys;
    }

    public void setPatrimonys(List<PatrimonyDTO> patrimonys) {
        this.patrimonys = patrimonys;
    }

    public List<SourceIncomeDTO> getSourceIncomes() {
        return sourceIncomes;
    }

    public void setSourceIncomes(List<SourceIncomeDTO> sourceIncomes) {
        this.sourceIncomes = sourceIncomes;
    }
}
