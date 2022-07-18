package FileIO.Uebungen;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Uebung6CreateRenameDeleteFILES {

    public static void createFiles(File directory) throws IOException {
        for (int i = 0; i < 10; i++) {
            File file = new File(directory.getAbsolutePath() + "//" + ThreadLocalRandom.current().nextInt() + ".mp3");
            if (file.createNewFile()) {
                System.out.println("CREATED: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists");
            }
        }
    }

    public static void renameFiles(File directory) {
        if (directory.isDirectory()) {
            for (File oldFile : directory.listFiles()) {
                File newFile = new File(oldFile.getParent() + "\\1_" + oldFile.getName());
                if (oldFile.renameTo(newFile)) {
                    System.out.println("RENAME: " + oldFile.getAbsolutePath() + " to " + newFile.getAbsolutePath());
                } else {
                    System.out.println("Sorry! The File can't be renamed");
                }
            }
        }
    }

    public static void deleteFiles(File directory) {
        if (directory.isDirectory()) {
            for (File f : directory.listFiles()) {
                f.delete();
                System.out.println("DELETED: " + f.getAbsolutePath());
            }
        }
    }
}
