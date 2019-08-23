package com.sample.basics;

class ThreadClass1 extends Thread{

    public void run()
    {
        for(int i=1;i<1000;i++)
           System.out.println("Class 1 i: "+i);
    }


}