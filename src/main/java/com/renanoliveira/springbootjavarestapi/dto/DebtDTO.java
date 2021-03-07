package com.renanoliveira.springbootjavarestapi.dto;

import java.io.Serializable;

public class DebtDTO implements Serializable {

    private String originDebt;

    private Double valueDebt;


    public DebtDTO() {
    }

    public DebtDTO(String originDebt, Double valueDebt) {
        this.originDebt = originDebt;
        this.valueDebt = valueDebt;
    }


    public String getOriginDebt() {
        return originDebt;
    }

    public void setOriginDebt(String originDebt) {
        this.originDebt = originDebt;
    }

    public Double getValueDebt() {
        return valueDebt;
    }

    public void setValueDebt(Double valueDebt) {
        this.valueDebt = valueDebt;
    }
}
