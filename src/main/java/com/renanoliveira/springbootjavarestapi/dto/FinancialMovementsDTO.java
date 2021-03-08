package com.renanoliveira.springbootjavarestapi.dto;

import java.io.Serializable;

public class FinancialMovementsDTO implements Serializable {

    private String originFinancialMovements;

    private String destinationFinancialMovements;

    private Double valueFinancialMovements;


    public FinancialMovementsDTO() {
    }

    public FinancialMovementsDTO(String originFinancialMovements, String destinationFinancialMovements, Double valueFinancialMovements) {
        this.originFinancialMovements = originFinancialMovements;
        this.destinationFinancialMovements = destinationFinancialMovements;
        this.valueFinancialMovements = valueFinancialMovements;
    }


    public String getOriginFinancialMovements() {
        return originFinancialMovements;
    }

    public void setOriginFinancialMovements(String originFinancialMovements) {
        this.originFinancialMovements = originFinancialMovements;
    }

    public String getDestinationFinancialMovements() {
        return destinationFinancialMovements;
    }

    public void setDestinationFinancialMovements(String destinationFinancialMovements) {
        this.destinationFinancialMovements = destinationFinancialMovements;
    }

    public Double getValueFinancialMovements() {
        return valueFinancialMovements;
    }

    public void setValueFinancialMovements(Double valueFinancialMovements) {
        this.valueFinancialMovements = valueFinancialMovements;
    }
}
