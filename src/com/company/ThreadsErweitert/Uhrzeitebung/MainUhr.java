package com.company.ThreadsErweitert.Uhrzeitebung;

public class MainUhr {
    public static void main(String[] args) {
        Uhr u1 = new Uhr(); // Time u1 = new Time would also work bc it creates an instance of runnable
        Uhr u2 = new Uhr(); // Time u1 = new Time would also work bc it creates an instance of runnable
        Thread t1 = new Thread(u1);
        Thread t2 = new Thread(u2);

        t1.start();
        t2.start();


        System.out.println("Drücken Sie eine Taste, um zu stoppen...");
        if (ConsoleHelperTime.readLine2() != null) {
            u1.requestShutDown2();
            System.out.println(t1.getState());
            System.out.println(t2.getState());
        }if (ConsoleHelperTime.readLine2() != null) {
            u2.requestShutDown2();
            System.out.println(t1.getState());
            System.out.println(t2.getState());
        }
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread has ended");
    }
}
