package com.renanoliveira.springbootjavarestapi.domain;

import com.renanoliveira.springbootjavarestapi.dto.FinancialMovementsDTO;
import com.renanoliveira.springbootjavarestapi.dto.LastPurchaseWithCreditCardDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document
public class Traceability implements Serializable {

    @Id
    private String id;

    private String document;

    private Date lastConsultationInBureau;

    private List<FinancialMovementsDTO> financialMovements = new ArrayList<>();

    private LastPurchaseWithCreditCardDTO lastPurchaseWithCreditCard;


    public Traceability() {
    }

    public Traceability(String id, String document, Date lastConsultationInBureau, LastPurchaseWithCreditCardDTO lastPurchaseWithCreditCard) {
        this.id = id;
        this.document = document;
        this.lastConsultationInBureau = lastConsultationInBureau;
        this.lastPurchaseWithCreditCard = lastPurchaseWithCreditCard;
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

    public Date getLastConsultationInBureau() {
        return lastConsultationInBureau;
    }

    public void setLastConsultationInBureau(Date lastConsultationInBureau) {
        this.lastConsultationInBureau = lastConsultationInBureau;
    }

    public List<FinancialMovementsDTO> getFinancialMovements() {
        return financialMovements;
    }

    public void setFinancialMovements(List<FinancialMovementsDTO> financialMovements) {
        this.financialMovements = financialMovements;
    }

    public LastPurchaseWithCreditCardDTO getLastPurchaseWithCreditCard() {
        return lastPurchaseWithCreditCard;
    }

    public void setLastPurchaseWithCreditCard(LastPurchaseWithCreditCardDTO lastPurchaseWithCreditCard) {
        this.lastPurchaseWithCreditCard = lastPurchaseWithCreditCard;
    }
}
