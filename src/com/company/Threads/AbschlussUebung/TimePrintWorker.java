package com.company.Threads.AbschlussUebung;

import java.util.Date;

public class TimePrintWorker extends Worker implements Runnable {

    public TimePrintWorker(String name) {
        super(name);
    }

    @Override
    public void run() {
        work();
    }

    @Override
    protected void work() {

        printStarted();
        while (shouldRun) {
            Date d = new Date();
            System.out.println(d);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        printStopped();
    }
}
