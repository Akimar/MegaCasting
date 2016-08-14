/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iia.megacasting.entities;

import java.util.Objects;

/**
 *
 * @author Akimar
 */
public class Profession {
    
    /****** Attributes ******/
    
    private int id;
    private String name;
    private ProfessionField professionField;
    

    /****** Getters &setters ******/
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProfessionField getProfessionField() {
        return professionField;
    }

    public void setProfessionField(ProfessionField professionField) {
        this.professionField = professionField;
    }

    
    
    /****** Constructors *****/
    
    public Profession(int id, String name, ProfessionField professionField) {
        this.id = id;
        this.name = name;
        this.professionField = professionField;
    }

    
    /****** Equals & hashCode *****/
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profession other = (Profession) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.professionField, other.professionField)) {
            return false;
        }
        return true;
    }
    
    
    
   
    
    
    
}
