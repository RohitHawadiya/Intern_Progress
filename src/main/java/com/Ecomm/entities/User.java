package com.Ecomm.entities;

import javax.persistence.Entity;

@Entity
public class User extends BaseEntity{

    private Address homeAddress;


    private WishList wishList;
}
