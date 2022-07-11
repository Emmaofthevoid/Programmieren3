package com.company.URL;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class checkResponseCode {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.campus02.at");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode != 200) {
                System.out.println("ALERT - your website does not work ... ERROR: " + responseCode);
            } else {
                System.out.println("Everything is fine!");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
