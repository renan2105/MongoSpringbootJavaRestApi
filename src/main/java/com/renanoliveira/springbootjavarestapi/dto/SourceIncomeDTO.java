package com.renanoliveira.springbootjavarestapi.dto;

import java.io.Serializable;

public class SourceIncomeDTO implements Serializable {

    private String originSourceOfIncome;

    private Double valueSourceOfIncome;


    public SourceIncomeDTO() {
    }

    public SourceIncomeDTO(String originSourceOfIncome, Double valueSourceOfIncome) {
        this.originSourceOfIncome = originSourceOfIncome;
        this.valueSourceOfIncome = valueSourceOfIncome;
    }


    public String getOriginSourceOfIncome() {
        return originSourceOfIncome;
    }

    public void setOriginSourceOfIncome(String originSourceOfIncome) {
        this.originSourceOfIncome = originSourceOfIncome;
    }


    public Double getValueSourceOfIncome() {
        return valueSourceOfIncome;
    }

    public void setValueSourceOfIncome(Double valueSourceOfIncome) {
        this.valueSourceOfIncome = valueSourceOfIncome;
    }
}
