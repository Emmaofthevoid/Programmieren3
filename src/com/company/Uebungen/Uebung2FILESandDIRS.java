package com.company.Uebungen;

import java.io.File;

public class Uebung2FILESandDIRS {

    public static void printFilesAndDirectories(String filedir) {
        File root = new File(filedir);
        for (File f : root.listFiles()) {
            if (root.isFile()) {
                System.out.println("File: " + f.getAbsolutePath());
            }
            if (root.isDirectory()) {
                System.out.println("Directory: " + f.getAbsolutePath());
            }
        }

    }

    public static void listf(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        for (File f : list) {
            if (f.isDirectory()) {
                System.out.println("DIR: " + f.getAbsoluteFile());
            } else {  //get absolute file and path comes to the same in this example
                System.out.println("FILE: " + f.getAbsolutePath());
            }
        }
    }
}
