package com.renanoliveira.springbootjavarestapi.dto;

import com.renanoliveira.springbootjavarestapi.domain.UserFinance;

import java.io.Serializable;
import java.util.List;

public class UserFinanceDTO implements Serializable {

    private String id;

    private String document;

    private String name;

    private List<DebtDTO> debts;

    private AddressDTO address;

    private Integer age;

    private List<PatrimonyDTO> patrimonys;

    private List<SourceIncomeDTO> sourceIncomes;


    public UserFinanceDTO() {
    }

    public UserFinanceDTO(UserFinance userFinance) {

        id = userFinance.getId();
        document = userFinance.getDocument();
        name = userFinance.getName();
        debts = userFinance.getDebts();
        address = userFinance.getAddress();
        age = userFinance.getAge();
        patrimonys = userFinance.getPatrimonys();
        sourceIncomes = userFinance.getSourceIncomes();

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
