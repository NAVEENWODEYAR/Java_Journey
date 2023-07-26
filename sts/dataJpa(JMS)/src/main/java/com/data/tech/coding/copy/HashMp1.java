package com.data.tech.coding.copy;

import java.util.HashMap;
import java.util.Map;

public class HashMp1
{
    public static void main(String[] args)
    {
        // HashMap
        HashMap<String,String> hm = new HashMap<>();
                System.out.println(hm);
                System.out.println("Hashmap is empty-> "+hm.isEmpty());

                        hm.put("R","One");
                        hm.put("A","Two");
                        hm.put("N","Three");
                        hm.put("K","Four");
                        hm.put("Rank","Five");
                System.out.println(hm);
                System.out.println("Size of the hashMap-> "+hm.size());

            // iterating the hashmap.,
            // only keys
            for (Object o:hm.keySet())
            {
                System.out.println(o);
            }

            // keys + values = entries.,
            for (Object s:hm.entrySet())
            {
                System.out.println(s);
            }

            // only values.,
            for (Object o: hm.values())
            {
                System.out.println(o);
            }

            System.out.println("Using Lambda.,,");
            // using lambda function
            hm.forEach((a,b) -> System.out.println("Key " + a + " Value " + b));
    }
}
