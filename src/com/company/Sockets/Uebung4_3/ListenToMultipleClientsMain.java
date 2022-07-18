package com.company.Sockets.Uebung4_3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Date;

public class ListenToMultipleClientsMain {
    public static void main(String[] args) {
        //Host name = localhost port = ???? see configuration withing server socket (9090)


        try {
            System.out.println("Starte Server");

            ServerSocket serverSocket = new ServerSocket(9090);
            SocketWorker socketWorker = new SocketWorker(serverSocket);

            Thread t1 = new Thread(socketWorker);

            Thread t2 = new Thread(socketWorker);

            t1.start();
            t2.start();

        } catch (SocketTimeoutException e) {
            System.out.println("Server Timeout");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
