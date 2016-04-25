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
public class IntField extends Field{

    private int value;

    public IntField(String name, int value)
    {
        super(name);
        this.value = value;
    }
        
    /**
     * Get the value of value
     *
     * @return the value of value
     */
    public int getValue() {
        return value;
    }

    /**
     * Set the value of value
     *
     * @param value new value of value
     */
    public void setValue(int value) {
        this.value = value;
    }

}
