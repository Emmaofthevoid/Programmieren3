package com.company.TextReader.Uebungen;

import java.io.File;

public class Uebung1METHODS {

    public static void fileInfo (File file) {
        System.out.println("Does this file exist? " + file.exists());
        System.out.println("The name of the File is: " + file.getName());
        System.out.println("Parent Directory of the File: " + file.getParent());
        System.out.println("Path to this File: " + file.getPath());
        System.out.println("Full path to this File: " + file.getAbsolutePath());
        System.out.println("Is this a directory? " + file.isDirectory());
        System.out.println("Is this a File? " + file.isFile());
        System.out.println("Is this a hidden File? " + file.isHidden());
        System.out.println("Is this File readable? " + file.canRead());
        System.out.println("Is this file writable? " + file.canWrite());
        System.out.println("File size: " + file.length());
    }
}
