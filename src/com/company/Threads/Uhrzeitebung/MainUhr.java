package com.company.Threads.Uhrzeitebung;

public class MainUhr {
    public static void main(String[] args) {
        Time u1 = new Time(); // Time u1 = new Time would also work bc it creates an instance of runnable
        Thread t1 = new Thread(u1);

        t1.start();
        System.out.println("Drücken Sie eine Taste, um zu stoppen...");
        if (ConsoleHelperTime.readLine2() != null) {
            u1.requestShutDown2();
            System.out.println(t1.getState());
        }
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread has ended");
    }
}
