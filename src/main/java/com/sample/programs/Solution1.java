package com.sample.programs;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.net.*;
import com.google.gson.*;

public class Solution1 {
    /*
     * Complete the function below. Base url:
     * https://jsonmock.hackerrank.com/api/movies/search/?Title=
     */

    public class Response {
        int page;
        int per_page;
        int total;
        int total_pages;
        ArrayList<Data> data;

        public int getPage() {
            return this.page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getPer_page() {
            return this.per_page;
        }

        public void setPer_page(int per_page) {
            this.per_page = per_page;
        }

        public int getTotal() {
            return this.total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getTotal_pages() {
            return this.total_pages;
        }

        public void setTotal_pages(int total_pages) {
            this.total_pages = total_pages;
        }

        public ArrayList<Data> getData() {
            return this.data;
        }

        public void setData(ArrayList<Data> data) {
            this.data = data;
        }
    }

    public class Data {
        String Title;
        int Year;
        String imdbID;

        public String getTitle() {
            return this.Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public int getYear() {
            return this.Year;
        }

        public void setYear(int Year) {
            this.Year = Year;
        }

        public String getImdbID() {
            return this.imdbID;
        }

        public void setImdbID(String imdbID) {
            this.imdbID = imdbID;

        }

    }

    public static void main(String[] args) throws IOException {

        String USER_AGENT = "Mozilla/5.0";

        String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=spiderman&page=2";

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
        Gson gson = new GsonBuilder().create();
        Response r = gson.fromJson(response.toString(), Response.class);
        r.data.forEach((Data data) -> {
            System.out.println(data.getTitle());
        });
        in.close();

    }
}