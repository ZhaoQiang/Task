/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrsoftware.task.backbean;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.rrsoftware.task.controller.ModelTempleteControllerLocal;


/**
 *
 * @author Zhao Qiang <zhaoqiang@rrsoftware.com>
 */
@Named(value = "modelTempleteEditorBean")
@ConversationScoped
public class ModelTempleteEditorBean implements Serializable{

    @Inject
    private Conversation conversation;
    
    @EJB
    private ModelTempleteControllerLocal modelTempleteController;
    
    /**
     * Creates a new instance of ModelTempleteEditorBean
     */
    public ModelTempleteEditorBean() {
    }
    
    public void onCreate()
    {
        modelTempleteController.createModelTemplete();
    }
    
    public String getName()
    {
        return modelTempleteController.getTemplete().getName();
    }
    
    public ModelTempleteControllerLocal getController()
    {
        return modelTempleteController;
    }
    
}
