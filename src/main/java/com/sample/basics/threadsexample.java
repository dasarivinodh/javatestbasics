package com.sample.basics;

class threadsexample extends Thread{

    public void run()
    {
        System.out.println("Running Thread...");
    }
    public static void main(String args[]) {
        System.out.println("Hello Threads");
        threadsexample t=new threadsexample();
        t.start(); 
        t.stop();

        // // t.start(); // op will not run run method

        ThreadClass1 t1=new ThreadClass1();
        ThreadClass2 t2=new ThreadClass2();
        t1.start();
        t2.start();

    }

}