// check all the given numbers are even or not.,
// [1,2,3,4,5,6,7,8];
package com.data.tech.coding.copy;

import java.util.*;
public class AllMatch
{
    public static void main(String[] args)
    {
        List<Integer> lt = Arrays.asList(1,2,3,4,5,6,7,8);
                      Boolean bl =  lt.stream().allMatch((n)-> n%2 ==0);
                     System.out.println(bl);
    }
}
