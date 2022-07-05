package com.company.Threads.Uebung3;

public class Counter implements Runnable {

    private final int sleepInterval = 1000;
    private static Object lock = new Object();
    private static int counter = 0;

    @Override
    public void run() {
        synchronized (lock) {
         while (counter < 20) { //oder for ( i = 0; i <= 10; i++)
                counter++;
                System.out.println(Thread.currentThread().getName());
                System.out.println(counter);
                try {
                    Thread.sleep(sleepInterval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("LOGIC THREAD END");
        }
    }
}
