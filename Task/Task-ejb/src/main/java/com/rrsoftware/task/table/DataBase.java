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
public class DataBase {
    
    private String name;
    private HashMap<String, Table> tables = new HashMap<>();
    
    
    public DataBase(){
    }

    public boolean addTable(Table table)
    {
        if (table != null)
        {
            String tableName = table.getName();
            if (tableName != null)
            {
                if (false == tables.containsKey(tableName))
                {
                    tables.put(tableName, table);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public void deleteTable(String name)
    {
        tables.remove(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Table> getTables() {
        return tables;
    }

    public void setTables(HashMap<String, Table> tables) {
        this.tables = tables;
    }
    
    
}
