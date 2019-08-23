package com.sample.basics;

import java.util.Comparator;

class CustomComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        
        if(o1.getMarks()<o2.getMarks())
          return 1000;
        else
          return -1;
    }
    
}