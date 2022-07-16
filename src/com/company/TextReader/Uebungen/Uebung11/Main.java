package com.company.TextReader.Uebungen.Uebung11;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ProductManager manager = new ProductManager();
        Product kekse = new Product("Kekse", 5, "Süßigkeiten");
        Product schoko = new Product("Schocko", 10, "Süßigkeiten");
        Product milch = new Product("Sojamilch", 7, "Non Dairy");

        manager.addProduct(kekse);
        manager.addProduct(schoko);
        manager.addProduct(milch);

        manager.saveToFile("savedProducts.txt");

        manager.readFromFile("savedProducts.txt");
    }
}
