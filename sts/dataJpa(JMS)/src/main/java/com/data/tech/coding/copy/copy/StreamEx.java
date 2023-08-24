package com.data.tech.coding.copy.copy;

import java.util.stream.Stream;

public class StreamEx
{
    public static void main(String[] args)
    {
        // Streams can be defined as a sequences of elements from a source which support data processing operations.
        // You can treat streams as operations on data.

        // empty stream,
        Stream<Integer> st = Stream.empty();
        System.out.println(st);
        System.out.println("Empty stream: "+st.count());

        // stream with single element.,
        Stream<StreamEx> st1 = Stream.of(new StreamEx(), new StreamEx());
        System.out.println("Stream with single element: "+st1.count());

        // stream of values.,
        Stream st2 = Stream.of(1,2,2,3,4,5,6,1,8,3,0,1,4,7,9,0,7,8,9);
                    System.out.println(st2.count());

        // intermediate operations - that return the stream of objects.,
        // 1. distinct()
        Stream st3 = Stream.of(1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,0);
        System.out.println("distinct() is an intermediate operation, returns stream of distinct object.,");
                    st3.distinct().forEachOrdered(System.out::println);

        //
    }
}
