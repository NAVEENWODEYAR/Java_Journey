// Find the common elements in the array
package com.data.tech.coding.copy;

import java.util.HashSet;

public class IntersectionOfArrays
{
    public static void intersectArray(int a[], int b[])
    {
        HashSet<Integer> h = new HashSet<>();

            for (int i=0; i<a.length-1; i++)
            {
                h.add(a[i]);
            }
//        System.out.println(h);

            for (int i=0; i<=b.length-1; i++)
            {
                if(h.contains(b[i]))
                {
                    System.out.println("Duplicate element  "+b[i]);
                }
                else
                {
                    h.add(b[i]);
                }
            }
        System.out.println(h);

    }
    public static void main(String[] args)
    {
       System.out.println("Intersection of two arrays,");
        intersectArray(new int[] {1,2,3,4,5},new int[] {1,3,5,7,9});
    }
}
