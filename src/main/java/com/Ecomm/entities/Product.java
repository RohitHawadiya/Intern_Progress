package com.Ecomm.entities;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Product extends BaseEntity{
    //other details
    private List<Image> images;

    private List<Size> sizes;

    private Long sizeQuantity;

    private List<Color> colors;

    private Long totalQuantity;

    private List<Review> reviews;
}
