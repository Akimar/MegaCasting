/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iia.megacasting.entities;

/**
 *
 * @author Akimar
 */
public class Client extends ContactDetails {
    
    /****** Attributes ******/
    
    private String name;

    
    /****** Getters & setters *****/
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    /****** Constructors ******/
    
    public Client(String name, String phoneNumber, String address, String zipCode, String city) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
    }
    
    
    
}
