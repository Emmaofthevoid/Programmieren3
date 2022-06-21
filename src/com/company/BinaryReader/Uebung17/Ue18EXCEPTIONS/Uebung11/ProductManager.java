package com.company.BinaryReader.Uebung17.Ue18EXCEPTIONS.Uebung11;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> arrproducts = new ArrayList<>();

    public void addProduct(Product p) {
        arrproducts.add(p);
    }

    public void saveToFile(String filepath) {
        File file = new File(filepath);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Product p : arrproducts) {
                bufferedWriter.write(p.toString());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert bufferedWriter != null;
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Product Information successfully saved.");
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
