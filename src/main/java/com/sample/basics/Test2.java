package com.sample.basics;

import java.util.ArrayList;

class Test1 {
    Test1(int x) {
        System.out.println("Constructor called " + x);
    }
}

class Test2 {
    Test1 t1 = new Test1(10);

    public static void main(String[] args) {
        Test2 t2 = new Test2(5);
        Integer s = new Integer(155);
        Integer s1 = new Integer(166);
        String s3 = s.toString() + s1.toString();
        System.out.println(s3);

        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(1);
        n.add(2);
        for (Integer i : n) {
            System.out.println(i);
        }

    }

    Test2(int i) {
        t1 = new Test1(i);
    }
}