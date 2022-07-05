package com.company.ThreadsErweitert.Uhrzeitebung;

import java.util.Date;

public class Uhr implements Runnable {
    private final int sleepInterval = 1000;
    private boolean isRunning = true;
    private static Object lock = new Object();


    public void requestShutDown2() {
        isRunning = false;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (isRunning) {
                Date d = new Date();
                System.out.println(Thread.currentThread().getName());
                System.out.print("[");

                System.out.print(d.toString());

                System.out.print(", CPUS: ");

                System.out.print(Runtime.getRuntime().availableProcessors());

                System.out.print(", FreeMem: ");

                System.out.print(Runtime.getRuntime().freeMemory());

                System.out.print("]");

                System.out.println();
                try {
                    Thread.sleep(sleepInterval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
