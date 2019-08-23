package com.sample.basics;

import java.util.ArrayList;
import java.util.Collections;

class comparableexample
{
   
    public static void main(String args[]) {
      
        System.out.println("hello");
        Student s =new Student("sanodh",736,15);
        Student s1 =new Student("satish",739,21);
        Student s2 =new Student("satta",890,55);
        ArrayList<Student> listSt=new ArrayList<Student>();
        listSt.add(s);
        listSt.add(s1);
        listSt.add(s2);
        for(Student x:listSt)
        {
             System.out.println(x);
        }
        System.out.println("+++++++++++++++++++++");
        Collections.sort(listSt);
        for(Student x:listSt)
        {
             System.out.println(x);
        }
        System.out.println("+++++++++++++++++++++");
        CustomComparator cc=new CustomComparator();
        listSt.sort(cc);
        for(Student x:listSt)
        {
             System.out.println(x);
        }


        
        
    }

}