package com.company.Threads.AbschlussUebung;

public class AbschlussMain {

    public static void main(String[] args) {

        String path = "C:\\Users\\s51640\\IdeaProjects\\Programmieren3\\savedProducts.txt";

        FileReadWorker fileReadWorker = new FileReadWorker(path, "fileReadWorker");

        TimePrintWorker timePrintWorker = new TimePrintWorker("timePrintWorker");

        Thread t2 = new Thread(fileReadWorker);
        Thread t1 = new Thread(timePrintWorker);
        Thread t3 = new Thread(fileReadWorker);


        t1.start();
        t2.start();
        t3.start();
        try {
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timePrintWorker.stopWorker();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("FERTIG");
    }
}
