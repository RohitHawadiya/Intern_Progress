package com.Ecomm.entities;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class WishList extends BaseEntity{


    private List<Product> products;
}
