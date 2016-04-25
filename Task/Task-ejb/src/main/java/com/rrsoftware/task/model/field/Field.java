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
public abstract class Field {
    private String name;
    private boolean mandatory;


    public Field()
    {}
    
    public Field(String name)
    {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }
    
    
    @Override
    public int hashCode() {
        return name.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Field)
        {
            return name.equals(((Field)obj).name);
        }
        return false;
    }
    
    
    
    
}
