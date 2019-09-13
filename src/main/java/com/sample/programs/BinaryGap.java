package com.sample.programs;

import java.util.ArrayList;
import java.util.ListIterator;

public class BinaryGap {

    public static void main(String[] args) {
        // int n = 15;
        // Integer temp = 0;
        // ArrayList<Integer> list = new ArrayList();
        // while (n > 0) {
        // temp = n % 2;
        // n = n / 2;
        // list.add(temp);
        // }
        // ListIterator<Integer> itr = list.listIterator();
        // while (itr.hasNext()) {
        // if (itr.next() == 1) {
        // System.out.println(list.indexOf(1));
        // }

        // }
        int n = 5, count = 0;
        Integer temp = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (n > 0) {
            temp = n % 2;
            n = n / 2;
            arr.add(temp);
        }

        for (Integer i : arr) {
            if (i == 1) {
                System.out.println(arr.indexOf(i));
            }
        }

    }
}