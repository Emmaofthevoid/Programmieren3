package com.company.FileIO.FileReaderUeb;

import java.io.IOException;
import java.io.StringWriter;

public class Uebung9_StringWriter {

    public static void main(String[] args) throws IOException {

        String data = "Das sind neue daten";

        StringWriter stringWriter = new StringWriter();
        stringWriter.write(data);
        stringWriter.write("HI");

        //with \ you make here as well a new line.
        stringWriter.flush();
        stringWriter.close();

        System.out.println(stringWriter);


    }
}
