package com.company.Threads;

public class RunnableExample implements Runnable {

    public static void main(String[] args) {
        System.out.println("Create Runnable");

        Runnable runnable = new RunnableExample();

        System.out.println("Create thread");
        Thread thread = new Thread(runnable);
        System.out.println(thread.getName());

        System.out.println("Start Thread");
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("LOSGIC THREAD START");
        System.out.println("Thread: " + Thread.currentThread().getName());
        System.out.println("LOGIC THREAD END");


    }
}
