/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrsoftware.task.controller;

import com.rrsoftware.task.delegation.PersistenceDelegation;
import com.rrsoftware.task.model.ModelTemplete;
import com.rrsoftware.task.util.Constant;
import javax.ejb.Stateful;

/**
 *
 * @author Zhao Qiang <zhaoqiang@rrsoftware.com>
 */
@Stateful
public class ModelTempleteController implements ModelTempleteControllerLocal {

    private ModelTemplete templete;
    
    @Override
    public ModelTemplete createModelTemplete()
    {
        templete = new ModelTemplete();
        templete.setName(Constant.UNDEFINED);
        return templete;
    }
    
    @Override
    public ModelTemplete getTemplete() {
        return templete;
    }

    @Override
    public void setTemplete(ModelTemplete templete) {
        this.templete = templete;
    }

    @Override
    public String getName() {
        return "HELLO!";
        /*
        if (templete != null)
        {
            return templete.getName();
        }
        return "NO-NAME";
*/
    }

    @Override
    public void setName(String name) {
        if (templete != null)
        {
            templete.setName(name);
        }
    }
    
    
    
    

}
