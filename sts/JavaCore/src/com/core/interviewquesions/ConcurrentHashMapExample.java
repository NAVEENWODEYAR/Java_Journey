package com.core.interviewquesions;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConcurrentHashMapExample
{
    public static void main(String[] args) 
    {
        // Create a ConcurrentHashMap with an initial capacity and load factor
        Map<Byte, Short> conHashMap = new ConcurrentHashMap<>(4, 0.4f);

        // Add elements to the ConcurrentHashMap
        conHashMap.put((byte) 1, (short) 10);
        conHashMap.put((byte) 2, (short) 20);
        conHashMap.put((byte) 3, (short) 30);

        // Retrieve and print elements
        System.out.println("Element with key 1: " + conHashMap.get((byte) 1)); // Output: Element with key 1: 10
        System.out.println("Element with key 2: " + conHashMap.get((byte) 2)); // Output: Element with key 2: 20
        System.out.println("Element with key 3: " + conHashMap.get((byte) 3)); // Output: Element with key 3: 30
    }
}

