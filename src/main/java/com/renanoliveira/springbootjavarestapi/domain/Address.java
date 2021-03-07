package com.renanoliveira.springbootjavarestapi.domain;

public class Address{

    private String street;

    private String district;

    private String city;

    private String state;

    private String country;

    private String complement;


    public Address() {
    }

    public Address(String street, String district, String city, String state, String country, String complement) {
        this.street = street;
        this.district = district;
        this.city = city;
        this.state = state;
        this.country = country;
        this.complement = complement;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}
