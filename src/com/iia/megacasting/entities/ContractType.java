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
public class ContractType {
    
    /****** Attributes *****/
    
    private int id;
    private String conType;

    /****** Getters & Stters ******/
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConType() {
        return conType;
    }

    public void setConType(String conType) {
        this.conType = conType;
    }

    
    /****** Constructors ******/
    
    public ContractType(int id, String conType) {
        this.id = id;
        this.conType = conType;
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
        final ContractType other = (ContractType) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.conType, other.conType)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
