package com.Ecomm.entities;

import javax.persistence.Entity;

@Entity
public class Review extends BaseEntity{

    private String text;

    private Byte rating;

    private Product product;

    private User user;
}
