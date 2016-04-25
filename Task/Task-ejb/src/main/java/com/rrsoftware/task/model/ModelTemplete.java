/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.rrsoftware.task.model;

import com.rrsoftware.task.delegation.PersistenceDelegation;
import com.rrsoftware.task.model.field.DateField;
import com.rrsoftware.task.model.field.Field;
import com.rrsoftware.task.model.field.IntField;
import com.rrsoftware.task.model.field.StringField;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Zhao Qiang <zhaoqiang@rrsoftware.com>
 */
public class ModelTemplete {
    
    private String name;

    private final HashMap<String, List<Relation>> relationMap = new HashMap<>();
    private final HashMap<String, Field> fields = new HashMap<>();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addField(String name, Date value)
    {
        addField(new DateField(name, value));
    }
    
    public void addField(String name, int value)
    {
        addField(new IntField(name, value));
    }
    
    public void addField(String name, String value)
    {
        addField(new StringField(name, value));
    }
    
    public void addField(Field field)
    {
        if (field != null)
        {
            fields.put(field.getName(), field);
        }
    }
    
    public void removeField(String name)
    {
        fields.remove(name);
    }
    
    public Field getField(Field field)
    {
        if (field != null)
        {
            return fields.get(field.getName());
        }
        return null;
    }
    
    public Field getField(String name)
    {
        return fields.get(name);
    }
    
    public void addRelation(String name, Relation relation)
    {
        List<Relation> relationList = relationMap.get(name);
        if (relationList == null)
        {
            relationList = new ArrayList<>();
            relationMap.put(name, relationList);
        }
        relationList.add(relation);
    }
    
    public List<Relation> findRelationList(String name)
    {
        return relationMap.get(name);
    }
    
}
