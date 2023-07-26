package com.data.tech.coding.copy;

import java.util.HashMap;
import java.util.Map;

public class PQ
{
    public static void main(String[] args)
    {
        Map<Integer, String> mp = new HashMap<>();
                            mp.put(1,"One");
                            mp.put(2,"Two");
                            mp.putIfAbsent(2,"Three");
                            System.out.println(mp);
                            System.out.println(mp.entrySet());

                // iterating the map.,
                for(Map.Entry<Integer,String> m: mp.entrySet())
                {
                    System.out.println("Key "+m.getKey() +"Value "+m.getValue());
                }
    }
}
