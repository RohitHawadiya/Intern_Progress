package com.Ecomm.entities;

import javax.persistence.Entity;

@Entity
public class Basket extends BaseEntity{
    private Long amount;
    private Integer quantity;
    private Color color;
    private Size size;

    private Product product;

}
