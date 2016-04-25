/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrsoftware.task.controller;

import com.rrsoftware.task.model.ModelTemplete;
import javax.ejb.Local;

/**
 *
 * @author Zhao Qiang <zhaoqiang@rrsoftware.com>
 */
@Local
public interface ModelTempleteControllerLocal {

    ModelTemplete createModelTemplete();

    public ModelTemplete getTemplete();

    public void setTemplete(ModelTemplete templete);
    
}
