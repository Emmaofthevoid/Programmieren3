package com.company.Threads.Uhrzeitebung;

import java.util.Date;

public class Time implements Runnable {
    private final int sleepInterval = 1000;
    private boolean isRunning = true;

    public void requestShutDown2() {
        isRunning = false;
    }

    @Override
    public void run() {
        while (isRunning) {

            Date date = new Date();
            System.out.println(date);
            try {
                Thread.sleep(sleepInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
