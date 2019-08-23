package com.sample.basics;

class ThreadClass2 extends Thread{

    public void run()
    {
        for(int i=1;i<1000;i++)
           System.out.println("Class 2 i: "+i);
    }


}