package com.renanoliveira.springbootjavarestapi.dto;

import java.io.Serializable;

public class LastPurchaseWithCreditCardDTO implements Serializable {

    private String originLastPurchase;

    private Double valueLastPurchase;


    public LastPurchaseWithCreditCardDTO() {
    }

    public LastPurchaseWithCreditCardDTO(String originLastPurchase, Double valueLastPurchase) {
        this.originLastPurchase = originLastPurchase;
        this.valueLastPurchase = valueLastPurchase;
    }


    public String getOriginLastPurchase() {
        return originLastPurchase;
    }

    public void setOriginLastPurchase(String originLastPurchase) {
        this.originLastPurchase = originLastPurchase;
    }

    public Double getValueLastPurchase() {
        return valueLastPurchase;
    }

    public void setValueLastPurchase(Double valueLastPurchase) {
        this.valueLastPurchase = valueLastPurchase;
    }
}
