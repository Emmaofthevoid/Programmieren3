package com.company.Uebungen.Uebung11;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> arrproducts = new ArrayList<>();

    public void addProduct(Product p) {
        arrproducts.add(p);
    }

    public void saveToFile(String path) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Product p : arrproducts) {
            bufferedWriter.write(p.toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();

        System.out.println("Product info successfully saved.");
    }

    public void readFromFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
        System.out.println("Product info successfuly read");
    }
}
