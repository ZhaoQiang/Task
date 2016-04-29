/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrsoftware.task.table;

import java.util.HashMap;

/**
 *
 * @author Zhao Qiang <zhaoqiang@rrsoftware.com>
 */
public class Row {
    private HashMap<String, Value> values = new HashMap<>();
    
    public void setValue(String key, Value value)
    {
        values.put(key, value);
    }
    
    public Value getValue(String key)
    {
        return values.get(key);
    }
    
    
    
}
