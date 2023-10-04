package com.Ecomm.entities;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Cart extends BaseEntity{
    private Long totalAmount;
    private List<Basket> baskets;

    private User user;
}
