package com.sample.basics;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.net.*;
// import com.google.gson.*;

public class Solution1 {
    /*
     * Complete the function below. Base url:
     * https://jsonmock.hackerrank.com/api/movies/search/?Title=
     */

    static class test {
        int page;
        int per_page;
        int total;
        int total_pages;
        int data;
    }

    public static void main(String[] args) throws IOException {

        String USER_AGENT = "Mozilla/5.0";

        String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=spiderman";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        // // add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

    }
}