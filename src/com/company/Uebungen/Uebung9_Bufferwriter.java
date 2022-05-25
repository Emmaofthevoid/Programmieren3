package com.company.Uebungen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Uebung9_Bufferwriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("test25-05.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Zeile1.0 \n"); // \n makes a new line
        bufferedWriter.write("Zeile2.0");
        bufferedWriter.write("Zeile3.0");
        bufferedWriter.write("Zeile1");
        //the method newLine also makes a new line (unsurprisingly)
        bufferedWriter.newLine();
        bufferedWriter.write("Zeile2");
        bufferedWriter.newLine();
        bufferedWriter.write("Zeile3");
        bufferedWriter.newLine();


        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
