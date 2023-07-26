package com.data.tech.coding.sorting.copy;

import java.util.Collections;
import java.util.stream.Stream;

public class StreamMpEx
{
    public static void main(String[] args)
    {
     // map() - is an intermediate operation, Returns a stream consisting of results after applying given function to elements of the stream.
        Stream<String> stu = Stream.of("Range Rover","Jaguar","Audi","Porshe","Ford");
               // stu.filter(car -> car.length() > 5).map(car -> car.toUpperCase()).sorted(Collections.reverseOrder()).forEach(System.out::println);

                // return the length of the string.,
//                stu.map(String::length).forEach((ln) ->System.out.println("Car Length; "+ln));
                stu.mapToInt(String::length).forEach((ln) ->System.out.println("Car Length; "+ln));

    }
}
