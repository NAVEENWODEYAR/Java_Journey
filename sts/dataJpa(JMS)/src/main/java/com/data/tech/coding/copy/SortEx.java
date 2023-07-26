package com.data.tech.coding.copy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class SortEx
{
    public static void main(String[] args)
    {
//        List evenNumbers = List.of(10,2,8,4,6);           // immurable
        List evenNumbers = Arrays.asList(10,2,8,6,4);

        System.out.println("Original list: "+evenNumbers);

        // sort using the Collectoins.sort()
        sort(evenNumbers);
        System.out.println("Natural sorted order: "+evenNumbers);

        // sort in reverse order.,
//            evenNumbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
            Collections.sort(evenNumbers,Collections.reverseOrder());
        System.out.println("Revese order : "+evenNumbers);

    }
}
