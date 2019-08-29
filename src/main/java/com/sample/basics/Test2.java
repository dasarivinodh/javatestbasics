package com.sample.basics;

class Test1 {
    Test1(int x) {
        System.out.println("Constructor called " + x);
    }
}

class Test2 {
    Test1 t1 = new Test1(10);

    public static void main(String[] args) {
        Test2 t2 = new Test2(5);
    }

    Test2(int i) {
        t1 = new Test1(i);
    }
}