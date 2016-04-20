/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrsoftware.task.model;

import com.rrsoftware.task.model.field.Field;
import java.util.ArrayList;
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
    private final HashMap<String, List<Relation>> relationMap = new HashMap<>();
    private final HashMap<String, List<Field>> fieldMap = new HashMap<>();
    
    public Model()
    {
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
    
    public void addField(Field field)
    {
        List<Field> fieldList = fieldMap.get(field.getName());
        if (fieldList == null)
        {
            fieldList = new ArrayList<>();
            fieldMap.put(field.getName(), fieldList);
        }
        fieldList.add(field);
        fieldMap.put(field.getName(), fieldList);
    }
    
    public List<Field> getFieldList(String name)
    {
        return fieldMap.get(name);
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
