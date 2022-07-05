package com.company.Threads.Example1CLONED.Example1;

public class Person implements Runnable {

    private boolean isRunning = true;

    public void requestShutDown() {
        isRunning = false;
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private static Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 100; i++) {
                if (isRunning) {
                    System.out.print("[");
                    System.out.print(getName() + " " + Thread.currentThread().getName());
                    System.out.println("]");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }

    }
}
