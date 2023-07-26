package com.data.tech.coding.sorting.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1
{
    public static void main(String[] args)
    {
        // limit()- selects first n elements.,
        Stream<Integer> st = Stream.of(1,23,4,5,6,7,8,8,9,0,1);

            // print first 5 elements.,
                    st.distinct().map(n -> n*n).sorted(Collections.reverseOrder()).limit(5).forEach(System.out::println);

           // skip the first n elements using the skip().,
        System.out.println("=======skip()======");
        List<Integer> al =  Arrays.asList(1,3,5,7,9,13,15,17,19);
                            al.parallelStream().skip(5).distinct().map(n -> n*n).sorted(Collections.reverseOrder()).forEach(System.out::println);

    }
}
