package com.sample.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class removesuplicate
{
    public static void main(String argd[]) {
      
        Integer list[]={1,1,1,0,4,66,7,0,8};
        //converting list to set
        Set<Integer> se=new HashSet<Integer>(Arrays.asList(list));
        for(Integer i:se)
        {
            System.out.println(i);
        }
        
       

    }
}