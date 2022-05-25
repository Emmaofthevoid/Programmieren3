package com.company.Uebungen;

import java.io.FileWriter;
import java.io.IOException;

public class Uebung9_Filewriter {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("testFW-25_05.txt");

        fileWriter.write("TEST \n");
        fileWriter.write("Zeile2");

        fileWriter.flush();
        fileWriter.close();
    }
}
