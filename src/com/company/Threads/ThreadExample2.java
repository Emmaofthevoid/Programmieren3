package com.company.Threads;

public class ThreadExample2 extends Thread {

    public void run() {
        System.out.println("Thread is running");

    }

    public static void main(String[] args) {
        Thread t1 = new ThreadExample2();
        Thread t2 = new ThreadExample2();

        t1.start();
        t2.start();
    }

}
