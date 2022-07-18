package com.company.Sockets;

import java.io.*;
import java.net.Socket;

public class ClientToServer {
    public static void main(String[] args) {

        // was putty für uns ersetzt, wenn du putty nicht verwenden willst.

        Socket socket = null;
        try {
            socket = new Socket("localhost", 9090);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.println("**** Answer Server ****");
            System.out.println(bufferedReader.readLine());

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); //wir client schreiben zum server
            bufferedWriter.write("PORT");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            System.out.println(bufferedReader.readLine());

            bufferedWriter.write("TIME");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            System.out.println(bufferedReader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
