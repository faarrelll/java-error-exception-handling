package com.enigma.java_error_exeption_handling.reasons;

import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkErrors {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.enigmacampgosling.com/api");
            HttpURLConnection conn =  (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(2000);
            conn.connect();
        } catch (ConnectException | MalformedURLException e) {
            System.out.println("Connection timeout");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
