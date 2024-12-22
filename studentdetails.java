package com.spring.springrest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdetails")

public class studentdetails {
    @Id
    private  String  id;
    private String name;
    private String number;
    private String address;
    
    public studentdetails() {
    }

    public studentdetails(String address, String id, String name, String number) {
        this.address = address;
        this.id = id;
        this.name = name;
        this.number = number;
    }
     

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
