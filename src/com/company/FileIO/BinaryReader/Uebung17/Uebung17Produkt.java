package com.company.FileIO.BinaryReader.Uebung17;

import java.io.Serializable;

// DONT FORGET TO IMPLEMENT SERIALIZABLE
public class Uebung17Produkt implements Serializable {
    String productName;
    Double price;
    String productCategory;

    public Uebung17Produkt(String productName, Double price, String productCategory) {
        this.productName = productName;
        this.price = price;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}
