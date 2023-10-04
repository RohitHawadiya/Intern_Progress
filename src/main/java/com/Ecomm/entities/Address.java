package com.Ecomm.entities;

import javax.persistence.Entity;

@Entity
public class Address extends BaseEntity{
    private String address;
    private Integer pinCode;
    private String state;
    private String city;

}
