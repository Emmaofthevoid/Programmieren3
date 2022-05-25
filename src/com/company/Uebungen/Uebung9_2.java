package com.company.Uebungen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Uebung9_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("ue_9.txt");
        FileWriter fileWriter = new FileWriter(file, true); // with append you add the new Zeilen under the content that was already in the File
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("EVEN MORE lines of whatever");
        printWriter.println("MoreMoreMore line of whatever");
        printWriter.print("I am printing without a line, because I can");
        printWriter.print("I am printing without a line, because I cancanCAN");


        printWriter.flush();
        printWriter.close();
    }
}
