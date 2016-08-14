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
public class Collaborator {
    
    
    /****** Attributes ******/
    
    private int id;
    private String login;
    private String name;

    
    /****** Getters & setters ******/
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    /****** Constructors *****/
    
    public Collaborator(int id, String login, String name) {
        this.id = id;
        this.login = login;
        this.name = name;
    }

    
    /****** Equals & hashCode ******/
    
    @Override
    public int hashCode() {
        int hash = 5;
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
        final Collaborator other = (Collaborator) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
