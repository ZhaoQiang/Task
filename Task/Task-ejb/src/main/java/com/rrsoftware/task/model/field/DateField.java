/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrsoftware.task.model.field;

import java.util.Date;

/**
 *
 * @author Zhao Qiang <zhaoqiang@rrsoftware.com>
 */
public class DateField extends Field{
    
    private Date value;
    
    public DateField(String name, Date value)
    {
        super(name);
        this.value = value;
    }
    
    /**
     * Get the value of value
     *
     * @return the value of value
     */
    public Date getValue() {
        return value;
    }

    /**
     * Set the value of value
     *
     * @param value new value of value
     */
    public void setValue(Date value) {
        this.value = value;
    }

}
