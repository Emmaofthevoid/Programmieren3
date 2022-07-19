package com.company.FileIO.FileReaderUeb;

import java.io.*;

public class Uebung7InputStreamReader {
    public static void main(String[] args) throws IOException {

        InputStream stream = new FileInputStream("text.txt");
        Reader reader = new InputStreamReader(stream);

        int c;
        while ((c = reader.read()) != -1) {
            System.out.println((char) c);
        }

        reader.close();

        //bufferedreader and filereader important for the exam

    }
}
