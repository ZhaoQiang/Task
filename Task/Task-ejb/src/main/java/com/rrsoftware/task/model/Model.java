/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrsoftware.task.model;

import com.rrsoftware.task.model.field.DateField;
import com.rrsoftware.task.model.field.Field;
import com.rrsoftware.task.model.field.IntField;
import com.rrsoftware.task.model.field.StringField;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author Zhao Qiang <zhaoqiang@rrsoftware.com>
 */
public class Model {
    
    private final UUID uid = UUID.randomUUID();

    
    public Model()
    {
        
    }
    
  
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Model)
        {
            Model another = (Model)obj;
            return another.getUid().equals(getUid());
        }
        else
        {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.uid);
        return hash;
    }
    
    public String getUid() {
        return uid.toString();
    }
    
}
