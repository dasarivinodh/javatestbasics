package com.sample.programs;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'winner' function below.
     *
     * The function is expected to return a STRING. The function accepts following
     * parameters: 1. STRING erica 2. STRING bob
     */

    public static String winner(String erica, String bob) {
        // Write your code here

        HashMap<Character, Integer> scroreTable = new HashMap<Character, Integer>();
        scroreTable.put('E', 1);
        scroreTable.put('M', 3);
        scroreTable.put('H', 5);
        int ericacount = 0, bobcount = 0;
        char ce[] = erica.toCharArray();
        char cb[] = bob.toCharArray();
        for (int i = 0; i < ce.length; i++) {
            ericacount = ericacount + scroreTable.get(ce[0]);

        }
        for (int i = 0; i < cb.length; i++) {

            bobcount = bobcount + scroreTable.get(cb[0]);
        }

        System.out.println(ericacount);
        System.out.println(bobcount);

        return ericacount == bobcount ? "Tie" : (ericacount > bobcount ? "Erica" : "Bob");

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        String erica = "EHH";

        String bob = "EMM";

        String result = Result.winner(erica, bob);

    }
}
