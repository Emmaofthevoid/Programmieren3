package com.company.Threads.AbschlussUebung;

import java.io.*;
import java.util.ArrayList;

public class FileReadWorker extends Worker implements Runnable {
    private String path;
    public ArrayList<String> lines;

    public FileReadWorker(String path, String name) {
        super(name);
        this.path = path;
        this.lines = new ArrayList<>();
    }

    private static Object lock = new Object();

    @Override
    protected void work() {
        printStarted();
        synchronized (lock) {
            lock.notify();
            try {
                String line;
                FileReader fileReader = new FileReader(path);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while ((line = bufferedReader.readLine()) != null) {
                    lines.add(line);
                    System.out.println(Thread.currentThread());
                    System.out.println(line);

                    if (!shouldRun) {
                        break;
                    }
                    Thread.sleep(1000);
                    lock.wait();
                    lock.notify();
                }
                bufferedReader.close();

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }

        }

        printStopped();
    }

    @Override
    public void run() {
        work();
    }
}
