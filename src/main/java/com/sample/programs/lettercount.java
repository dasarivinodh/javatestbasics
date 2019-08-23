package com.sample.programs;

import java.util.HashMap;
import java.util.Map;

class lettercount {
    public static void main(String []args)
    {
        String s="Hello ADP";
        char arrach[]=s.toCharArray();
        Map<Character,Integer> map=new HashMap<Character,Integer>();

        for(char c:arrach)
        {
            if(map.containsKey(c))
            {
                Integer count=map.get(c);
                count++;
                map.put(c,count);
            }
            else
              map.put(c, 1);
        }

        map.forEach( (k, v) ->  System.out.println(k+" -- "+v) );

      
    }

}