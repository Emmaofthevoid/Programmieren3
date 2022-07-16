package com.company.BinaryReader;

import java.io.*;

public class Uebung16 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("object.dat");

        //write objects in the file, initialize the 2 thingies
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        //initialize the other two thingies to read from the file
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        String string = "Hallo Welt";

        //write in the file
        objectOutputStream.writeObject(string);
        objectOutputStream.flush();
        objectOutputStream.close();

        String inputText = (String) objectInputStream.readObject();
        System.out.println(inputText);

        objectInputStream.close();


    }
}
