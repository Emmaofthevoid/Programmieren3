package com.company.Uebungen;

import java.io.*;

public class Uebung8 {

    public static void main(String[] args) throws IOException {

        //ready to receive use input
        InputStreamReader stream = new InputStreamReader(System.in);

        //zeile für zeile wird eingelesen
        BufferedReader bufferedReader = new BufferedReader(stream);

        String line;
       // while (!(line = bufferedReader.readLine()) != null) --> without the if Bedingung then it works the same
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            //check if the input is STOP
            if (line.equals("STOP")) {
                //if yes, go out of the while loop
                break;
            }
        }
        System.out.println("CLOSED");
        stream.close();
    }
}
