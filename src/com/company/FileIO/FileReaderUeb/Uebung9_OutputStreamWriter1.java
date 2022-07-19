package com.company.FileIO.FileReaderUeb;

import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Uebung9_OutputStreamWriter1 {
    public static void main(String[] args) throws IOException {

        String data = "EXAMPLE- example";

        FileOutputStream fileOutputStream = new FileOutputStream("testOUTPUT.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, UTF_8 /*not sure for what this is but it seems to be important*/);

        outputStreamWriter.write(data);
        outputStreamWriter.flush();
        outputStreamWriter.close();


    }
}
