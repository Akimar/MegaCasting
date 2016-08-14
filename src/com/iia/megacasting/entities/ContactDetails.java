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
public abstract class ContactDetails {
    
    /****** Attributes *****/
    
    protected int  id;
    protected String phoneNumber;
    protected String address;
    protected String zipCode;
    protected String city;

    
    
    /****** Getters and setters ******/
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }    

    
    /****** Equals & hashCode ****/
    
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
        final ContactDetails other = (ContactDetails) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.phoneNumber, other.phoneNumber)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.zipCode, other.zipCode)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        return true;
    }
    
    
}
