package com.company.Threads.Uebung3Alternate.Uebung3;

import java.util.ArrayList;

public class CounterMain {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
