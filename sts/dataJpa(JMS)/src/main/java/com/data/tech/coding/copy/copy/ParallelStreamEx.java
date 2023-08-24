package com.data.tech.coding.copy.copy;

import java.util.*;

public class ParallelStreamEx
{
    public static void main(String[] args)
    {
        // Parallel stream.,
        List <String>empList = Arrays.asList("Ammie","Zoya","Mona","Roney","Bella");

            // Normal execution.,
        System.out.println("=====skip()=====");
        empList.stream().filter((String emp) -> emp.length() >2).skip(1).forEach(System.out::println);
        System.out.println("=====limit()=====");
        empList.stream().filter((String emp) -> emp.length() >2).limit(3).forEach(System.out::println);

        // parallel execution
        System.out.println("======Parallel Execution=======");
        empList.parallelStream().filter((String name)-> name.length() > 3).map(name -> name.toUpperCase()).forEach(System.out::println);
    }
}
