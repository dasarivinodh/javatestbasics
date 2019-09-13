package com.sample.programs;

// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;

// class Result {

//     /*
//      * Complete the 'winner' function below.
//      *
//      * The function is expected to return a STRING. The function accepts following
//      * parameters: 1. STRING erica 2. STRING bob
//      */

//     public static String winner(String erica, String bob) {
//         // Write your code here

//         HashMap<Character, Integer> scroreTable = new HashMap<Character, Integer>();
//         scroreTable.put('E', 1);
//         scroreTable.put('M', 3);
//         scroreTable.put('H', 5);
//         int ericacount = 0, bobcount = 0;
//         char ce[] = erica.toCharArray();
//         char cb[] = bob.toCharArray();
//         for (int i = 0; i < ce.length; i++) {
//             ericacount = ericacount + scroreTable.get(ce[0]);

//         }
//         for (int i = 0; i < cb.length; i++) {

//             bobcount = bobcount + scroreTable.get(cb[0]);
//         }

//         System.out.println(ericacount);
//         System.out.println(bobcount);

//         return ericacount == bobcount ? "Tie" : (ericacount > bobcount ? "Erica" : "Bob");

//     }

// }

// public class Solution {
//     public static void main(String[] args) throws IOException {

//         String erica = "EHH";

//         String bob = "EMM";

//         String result = Result.winner(erica, bob);

//     }
// }

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'slowestKey' function below.
     *
     * The function is expected to return a CHARACTER. The function accepts
     * 2D_INTEGER_ARRAY keyTimes as parameter.
     */

    public static char slowestKey(List<List<Integer>> keyTimes) {
        // Write your code here
        int character, time, n = 0, diff;
        int arr[] = new int[keyTimes.size()];
        char arr1[] = new char[keyTimes.size()];
        for (List<List<Integer>> key : list) {
            for (List times : key) {
                character = times.get(0);
                arr[n++] = times.get(1);
            }
        }
        int dif = 150;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j = i + 1; j++) {
                if (Math.abs(arr[i] - arr[j]) < dif) {
                    dif = Math.abs((arr[i] - arr[j]));
                }
            }
        }
        int a = 97;
        return (char) (a + arr[dif]);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int keyTimesRows = Integer.parseInt(bufferedReader.readLine().trim());
        int keyTimesColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> keyTimes = new ArrayList<>();

        for (int i = 0; i < keyTimesRows; i++) {
            String[] keyTimesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> keyTimesRowItems = new ArrayList<>();

            for (int j = 0; j < keyTimesColumns; j++) {
                int keyTimesItem = Integer.parseInt(keyTimesRowTempItems[j]);
                keyTimesRowItems.add(keyTimesItem);
            }

            keyTimes.add(keyTimesRowItems);
        }

        char result = Result.slowestKey(keyTimes);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}