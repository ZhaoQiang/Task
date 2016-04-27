/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.rrsoftware.task.table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Zhao Qiang <zhaoqiang@rrsoftware.com>
 */
public class Table {
    
    private String name;
    
    private HashMap<String, Column> tableDef = new HashMap<>();
    private List<Row> data = new ArrayList<>();
    
    public boolean addColumn(Column column)
    {
        if (column != null)
        {
            tableDef.put(column.getName(), column);
            return true;
        }
        return false;
    }
    
    public void deleteColumn(String name)
    {
        tableDef.remove(name);
    }
    
    public boolean updateColumn(Column column)
    {
        if (column != null)
        {
            tableDef.put(column.getName(), column);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    public HashMap<String, Column> getTableDef() {
        return tableDef;
    }

    public void setTableDef(HashMap<String, Column> tableDef) {
        this.tableDef = tableDef;
    }

    public List<Row> getData() {
        return data;
    }

    public void setData(List<Row> data) {
        this.data = data;
    }
    
    
}
