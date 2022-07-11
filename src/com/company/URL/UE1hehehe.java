package com.company.URL;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class UE1hehehe {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Bitte gültige URL eingeben.");
            String urlEingabe = input.nextLine();
            String line;
            URL url = new URL(urlEingabe);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

            FileWriter demoFile = new FileWriter("demofile.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(demoFile);


            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.flush();
            bufferedWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
