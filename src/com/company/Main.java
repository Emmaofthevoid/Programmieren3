package com.company;

import com.company.Uebungen.Uebung1;
import com.company.Uebungen.Uebung2;

import java.io.File;
import java.io.IOException;

import static com.company.Uebungen.Uebung1.fileInfo;
import static com.company.Uebungen.Uebung2.listf;
import static com.company.Uebungen.Uebung2.printFilesAndDirectories;
import static com.company.Uebungen.Uebung3.listFilesAndDirectoriesWithSubFolders;
import static com.company.Uebungen.Uebung5.makeDirs;
import static com.company.Uebungen.Uebung6.*;


public class Main {

    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Users\\s51640\\Desktop\\new");
//        File dir = new File("C:\\");
//
//        fileInfo(file);
//        System.out.println("****");
//        printFilesAndDirectories("C:\\");
//        System.out.println("***");
//        listf("C:\\");
//
//        System.out.println("FROM HERE");
//        listFilesAndDirectoriesWithSubFolders("C:\\Users\\s51640\\Desktop\\");
//
//       // makeDirs();

        File file = new File("C:\\Users\\s51640\\Desktop\\Uebung6");
       // createFiles(file);
        //renameFiles(file);

        deleteFiles(file);




    }
}
