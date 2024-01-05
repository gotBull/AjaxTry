package com.chair.ajaxtry.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String code;
    private String name;
    private String line;
    private String scale;
    private String description;
    private int qty;
    private double MSRP;
}
