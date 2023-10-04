package com.Ecomm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class Image extends BaseEntity{
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] imageData;
}
