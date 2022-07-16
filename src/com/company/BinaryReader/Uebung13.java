package com.company.BinaryReader;

import java.io.*;

public class Uebung13 {
    public static void main(String[] args) throws IOException {
        File file = new File("test25-05.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int readerVariable;
        int howManyChars = 0;
        while ((readerVariable = bufferedInputStream.read()) != -1) {
            if (!Character.isWhitespace((char) readerVariable)) {
                howManyChars++;
            }
            System.out.print((char) readerVariable);
        }
        System.out.println();
        System.out.println("How many characters was that? :  " + howManyChars);

        //ALWAYS CLOSE
        bufferedInputStream.close();
    }
}
