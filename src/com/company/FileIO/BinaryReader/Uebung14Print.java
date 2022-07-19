package com.company.FileIO.BinaryReader;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Uebung14Print {

    public static void main(String[] args) throws FileNotFoundException {

        String data = " Das ist ein Test";
        PrintStream output = new PrintStream("test.dat");
        output.print(data);
        output.flush();
        output.print(data);
        output.flush();
        output.close();


        String anotherData = "This is the text that will go in the datei";
        PrintStream output1 = new PrintStream("nameOfMyNewDatei2.dat");
        output1.print(anotherData);
        output1.flush();
        output1.close();
    }
}
