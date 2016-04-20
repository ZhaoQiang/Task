/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrsoftware.task.model;

/**
 *
 * @author Zhao Qiang <zhaoqiang@rrsoftware.com>
 */
public class Relation {
    private Model modelA;
    private Model modelB;
    private String nameForA;
    private String nameForB;
    
    public Relation()
    {}
    
    public static Relation createRelation(Model modelA, Model modelB, String nameForA, String nameForB)
    {
        Relation relation = new Relation();
        relation.setModelA(modelA);
        relation.setModelB(modelB);
        relation.setNameForA(nameForA);
        relation.setNameForB(nameForB);
        if (nameForA != null)
        {
            modelA.addRelation(nameForA, relation);
        }
        if (nameForB != null)
        {
            modelB.addRelation(nameForB, relation);
        }
        
        return relation;
    }
    
    public Model getModelA() {
        return modelA;
    }

    public void setModelA(Model modelA) {
        this.modelA = modelA;
    }

    public Model getModelB() {
        return modelB;
    }

    public void setModelB(Model modelB) {
        this.modelB = modelB;
    }
    
    public String getNameForA() {
        return nameForA;
    }

    public void setNameForA(String nameForA) {
        this.nameForA = nameForA;
    }

    public String getNameForB() {
        return nameForB;
    }

    public void setNameForB(String nameForB) {
        this.nameForB = nameForB;
    }
    
    
}
