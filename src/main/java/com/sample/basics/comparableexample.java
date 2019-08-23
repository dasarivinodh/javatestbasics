package com.sample.basics;

import java.util.ArrayList;

class comparableexample
{
   
    public static void main(String args[]) {
      
        System.out.println("hello");
        Student s =new Student("Vinodh",736,15);
        Student s1 =new Student("Vishnu",739,21);
        Student s2 =new Student("Datta",890,55);
        ArrayList<Student> listSt=new ArrayList<Student>();
        listSt.add(s);
        listSt.add(s1);
        listSt.add(s2);
        for(Student x:listSt)
        {
             System.out.println(x);
        }
        listSt.sort();
        for(Student x:listSt)
        {
             System.out.println(x);
        }

        
        
    }

}