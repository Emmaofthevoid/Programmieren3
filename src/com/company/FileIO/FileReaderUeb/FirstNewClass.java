package com.company.FileIO.FileReaderUeb;

import java.io.File;
import java.io.IOException;

public class FirstNewClass {

    public static void main(String[] args) throws IOException {
        //ich hole mir ein separator, whatever that means
        String fileSeparator = System.getProperty("file.separator");
        System.out.println("File Separator: " + fileSeparator);


        // name of the doku has to be extra written in the end, also dopple slash
        //steuerung click fürs nachlesen (new tab)
        // name of the doku has to be extra written in the end, also dopple slash
        // strg d = duplicate strg x = delete whole Zeile
        File file = new File("C:\\Users\\s51640\\Desktop\\text.txt");
        File file2 = new File("C:" + fileSeparator +"Users" + fileSeparator + "s51640" + fileSeparator + "Desktop" + fileSeparator + "text.txt");
        File html = new File ("test.html");

        if (html.createNewFile()) {
            System.out.println("new file");
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getAbsoluteFile());
        } else {
            System.out.println("already exists");
        }

    }
}
