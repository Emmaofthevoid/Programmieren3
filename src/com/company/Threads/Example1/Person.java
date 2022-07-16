package com.company.Threads.Example1;

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

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (isRunning) {
                System.out.println(getName() + " " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else {
                break;
            }
        }

    }
}
