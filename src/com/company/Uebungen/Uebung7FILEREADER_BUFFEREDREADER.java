package com.company.Uebungen;

import java.io.*;

public class Uebung7FILEREADER_BUFFEREDREADER {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

       //Alles in eine Zeile zusammen
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("test.txt"));


        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
        fileReader.close();

        File file1 = new File("test.txt");
        FileReader fileReader1 = new FileReader(file1);

        System.out.println("**********");

        int c;
        while ((c = fileReader1.read()) != -1) {
            char character = (char) c;
            System.out.print(character);
        }

        fileReader1.close();
    }

}
