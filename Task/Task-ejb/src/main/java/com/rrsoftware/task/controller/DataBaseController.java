/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrsoftware.task.controller;

import com.rrsoftware.task.table.DataBase;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

/**
 *
 * @author Zhao Qiang <zhaoqiang@rrsoftware.com>
 */
@Singleton
@LocalBean
public class DataBaseController {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    // for now, only one DB
    private DataBase database = new DataBase();
    
    public DataBaseController()
    {
        database.setName("Universal");
    }
    
    public DataBase createDataBase()
    {
        return database;
    }
    
    
    
}
