package com.company.URL;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class submitPostRequest {

    public static void main(String[] args) {
        String email = "";
        String password = "";

        try {
            URL url = new URL("https://moodle.campus02.at/my/");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setDoOutput(true);

            String parameter = "username = " + email + " password = " + password;

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream());

            outputStreamWriter.write(parameter);
            outputStreamWriter.flush();

            System.out.println(httpURLConnection.getResponseCode());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
