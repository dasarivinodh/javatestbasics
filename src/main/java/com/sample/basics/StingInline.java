package com.sample.basics;

import javax.lang.model.util.ElementScanner6;

class StingInline {

    public static void main(String[] args) {
        String str = "ABBCCCCCDDDDE";
        int count = 1;
        char in = str.charAt(0);
        int length = str.length();
        for (int i = 1; i < length; i++) {

            if (in == str.charAt(i))
                count++;
            else {
                in = str.charAt(i);
                str = str.substring(0, i - count) + str.charAt((i) - count) + Integer.toString(count)
                        + str.substring(i, (str.length()));
                length = str.length();
                i = str.indexOf(in);
                count = 1;
            }
            if (i == length - 1) {
                in = str.charAt(i);
                str = str.substring(0, i - count) + str.charAt((i) - count) + str.substring(i, (str.length()))
                        + Integer.toString(count);

            }
        }
        System.out.println(str);

    }
}
