package com.company.FileIO.BinaryReader.Uebung17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Uebung17ProductManager extends EOFException {

    private ArrayList<Uebung17Produkt> productsArray;

    public Uebung17ProductManager() {
        this.productsArray = new ArrayList<>();
    }

    public void add(Uebung17Produkt p) {
        productsArray.add(p);
    }

    public void save(String path) throws IOException {
        File newFile = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(newFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        System.out.println("Write to file: ");
        for (Uebung17Produkt p : productsArray) {
            objectOutputStream.writeObject(p);
            System.out.println(p);

        }
        objectOutputStream.flush();
        objectOutputStream.close();
        System.out.println("Objects were added in the array");
    }

    public void load(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Uebung17Produkt> prodlist = new ArrayList<>();

        Object object;

        while ((object = objectInputStream.readObject()) != null) {
            Uebung17Produkt p = (Uebung17Produkt) object;
            prodlist.add(p);
        }
        System.out.println(prodlist);
        System.out.println("read finished");

    }
}
