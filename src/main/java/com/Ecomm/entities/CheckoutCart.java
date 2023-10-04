package com.Ecomm.entities;

import javax.persistence.Entity;

@Entity
public class CheckoutCart extends BaseEntity{

    private Long totalAmount;
    private Long finalAmount;
    private Cart cart;
    private Address deliveryAddress;
    private String paymentMode;
    private String paymentDetails;


}
