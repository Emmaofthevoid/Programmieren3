package com.company.Sockets.Uebung4_3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SocketWorker implements Runnable {
        ServerSocket serverSocket;

    public SocketWorker(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    @Override
    public void run() {
        try {

            Socket socket = serverSocket.accept(); //geht erst weiter wenn jemand sich verbunden hat
            //Socket ist die Connection zw client und server
            serverSocket.setSoTimeout(300000); //30 sekunden
            System.out.println("**client hat sich verbunden**");

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream()); // was ich (Server) zum Client schreibe
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write("Hello");
            bufferedWriter.newLine();
            bufferedWriter.flush();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String command;
            while ((command = bufferedReader.readLine()) != null) {
                System.out.println("Client has sent : " + command);

                if (command.equals("TIME")) {
                    Date date = new Date();
                    bufferedWriter.write(date.toString());
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                } else if (command.equals("PORT")) {
                    bufferedWriter.write("Remote port : " + socket.getPort());
                    bufferedWriter.write("Port: " + socket.getLocalPort());
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                } else if (command.equals("END")) {
                    bufferedWriter.write("ENDE");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    break;
                } else {
                    bufferedWriter.write("**Unknown Command**");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                }
            }
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("***Server wurde beendet***");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

