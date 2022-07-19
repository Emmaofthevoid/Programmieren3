package com.company.FileIO.BinaryReader.Uebung17.Ue18EXCEPTIONS.Uebung11;

public class Product {
    String productName;
    double price;
    String productCategory;

    public Product(String productName, double price, String productCategory) {
        this.productName = productName;
        this.price = price;
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product: " +
                "Name: " + productName + '\'' +
                " price: " + price +
                " productCategory: " + productCategory + '\'';
    }
}
