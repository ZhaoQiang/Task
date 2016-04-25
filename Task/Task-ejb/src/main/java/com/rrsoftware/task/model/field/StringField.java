/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrsoftware.task.model.field;

/**
 *
 * @author Zhao Qiang <zhaoqiang@rrsoftware.com>
 */
public class StringField extends Field{
    
    private String value;
    
    public StringField(String name, String value)
    {
        super(name);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
