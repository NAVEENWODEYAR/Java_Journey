package com.data.tech.coding.copy.copy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Find the duplicate elements in the java.,
public class DuplicateElments
{
    public static void main(String[] args)
    {
        List lt = Arrays.asList(1,2,3,3,4,4,5,6,7,7,8,9);
        HashSet h = new HashSet();
        List<Integer> l = (List<Integer>) lt.stream().filter(i ->!h.add(i)).collect(Collectors.toList());
        System.out.println(l);
    }
}
