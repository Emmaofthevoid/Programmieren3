package com.company.URL;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class SetClientFields {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://www.campus02.at");
            URLConnection urlConnection = url.openConnection();

            System.out.println(urlConnection.getRequestProperties());

            url.openConnection().setRequestProperty("User-Agent", "Java Client Sascha");
            urlConnection.setRequestProperty("Accept-Language", "en-US");
            urlConnection.setRequestProperty("Accept", "text/html");

            System.out.println(urlConnection.getRequestProperties());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
