package com.company.BinaryReader;

import java.io.*;

public class Uebung14 {
    public static void main(String[] args) throws IOException {
        File file = new File("test-binary.dat");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        String outputText = "Das ist ein neuer Test";

        for (char c : outputText.toCharArray()) {
            bufferedOutputStream.write(c);
            System.out.println(c);
        }
        //ALWAYS FLUSH BEFORE CLOSING
        bufferedOutputStream.flush();
        //ALWAYS CLOSE AFTER FLUSHING
        bufferedOutputStream.close();

    }
}
