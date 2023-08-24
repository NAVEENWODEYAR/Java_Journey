package com.data.tech.coding.copy.copy;

import java.util.HashMap;
import java.util.Map;

public class HashMp
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
        for (Map.Entry<String,String>mp :hm.entrySet())
        {
            System.out.println(mp.getKey() +" "+ mp.getValue());
        }
    }
}
