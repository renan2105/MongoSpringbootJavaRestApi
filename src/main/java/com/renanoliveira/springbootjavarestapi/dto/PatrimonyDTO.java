package com.renanoliveira.springbootjavarestapi.dto;

import com.renanoliveira.springbootjavarestapi.PatrimonyTypeEnum;

import java.io.Serializable;

public class PatrimonyDTO implements Serializable {

    private PatrimonyTypeEnum type;

    private String patrimonyName;

    private Double patrimonyValue;


    public PatrimonyDTO() {
    }

    public PatrimonyDTO(PatrimonyTypeEnum type, String patrimonyName, Double patrimonyValue) {
        this.type = type;
        this.patrimonyName = patrimonyName;
        this.patrimonyValue = patrimonyValue;
    }


    public PatrimonyTypeEnum getType() {
        return type;
    }

    public void setType(PatrimonyTypeEnum type) {
        this.type = type;
    }

    public String getPatrimonyName() {
        return patrimonyName;
    }

    public void setPatrimonyName(String patrimonyName) {
        this.patrimonyName = patrimonyName;
    }

    public Double getPatrimonyValue() {
        return patrimonyValue;
    }

    public void setPatrimonyValue(Double patrimonyValue) {
        this.patrimonyValue = patrimonyValue;
    }
}
