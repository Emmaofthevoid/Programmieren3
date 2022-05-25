package com.company.Uebungen;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uebung10 {
    public static void main(String[] args) throws IOException {

        InputStreamReader stream = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(stream);
        System.out.println("Geben Sie etwas ein");

        FileWriter fileWriter = new FileWriter("ue10.txt");
        String line;
        while (!(line = bufferedReader.readLine()).equals("STOP")) {
            System.out.println(line);

            fileWriter.write(line + "\n");
        }
        bufferedReader.close();
        fileWriter.flush();
        fileWriter.close();

        System.out.println("Datei erzeugt");

    }
}
