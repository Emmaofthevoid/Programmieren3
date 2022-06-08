package com.company.TextReader.Uebungen;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Uebung9 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("text.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);


        printWriter.println("Zeile1");
        printWriter.println("Zeile2");
      ;
        printWriter.println("ohneLN");
        printWriter.println("ohneLN");
        //zum Zeilen formatieren %d is for digit, %s is for String
        printWriter.format("This is a %s program with %d MB", "JAVA", 100);
        printWriter.println("This is a JAVA program with 100 MB");

        //um sicher zu stellen dass alles geschrieben ist
        printWriter.flush();
        printWriter.close();
        System.out.println("FERTIG");
    }
}
