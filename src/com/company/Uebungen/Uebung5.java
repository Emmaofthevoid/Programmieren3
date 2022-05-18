package com.company.Uebungen;

import java.io.File;
import java.util.Scanner;

public class Uebung5 {

    public static void makeDirs () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Directory Path where new folder should be created");
        String path = scanner.next();
        System.out.println("Enter the name of the NEW directories");
        path = path + scanner.next();

        File dirs = new File(path);

        boolean created = dirs.mkdirs();

        if (created) {
            System.out.println("Directory " + path + " was created ");
        }

        else {
            System.out.println("Directory " + path + " was created ");
        }


    }
    public static void createDirectories(File f) {
        //check if file is a file or a dir
        if (f.isDirectory()) {
            //perform mkdira to try create a directory - returns true if success, returns false if not
            System.out.println("Directory " + f.getAbsolutePath() + " created?: " + f.mkdirs());
        }
        else {
            System.out.println("Directory " + f.getAbsolutePath() + " created?: " + f.mkdirs());
        }

    }

}
