package FileIO.Uebungen;

import java.io.File;

public class Uebung3FILESandDIRS2 {

    public static void listFilesAndDirectoriesWithSubFolders(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File f : list) {
            if (f.isDirectory()) {
                System.out.println("DIR: " + f.getAbsoluteFile());
                listFilesAndDirectoriesWithSubFolders(f.getAbsolutePath());
            } else {
                System.out.println("FILE: " + f.getAbsolutePath());
            }
        }
    }
}
