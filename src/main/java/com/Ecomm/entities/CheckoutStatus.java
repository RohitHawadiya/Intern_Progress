package com.Ecomm.entities;

import javax.persistence.Entity;

@Entity
public class CheckoutStatus extends BaseEntity{
    private Long checkoutId;
    private Boolean status;
    private String details;

    private Boolean deliverd;

    private User user;
}
