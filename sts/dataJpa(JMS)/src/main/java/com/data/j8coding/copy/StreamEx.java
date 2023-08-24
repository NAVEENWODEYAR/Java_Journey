package com.data.j8coding.copy;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamEx 
{
	public static void main(String[] args)
    {
        // create the list object and initialize it.,
        List<Integer> lt = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(lt);

        // iterate the list.,
//        Iterator it = lt.iterator();
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }

        // process the data using stream.,filter
//       List lt1 = lt.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
//        System.out.println("Even numbers, "+lt1);

        // process the data using stream., map
//        lt.stream().map(n -> n*n).forEach(a -> System.out.println("Power of the numbers, "+a));

        // filter.,
        Optional<Integer> l=lt.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println("Max value "+l.get());

    }

}
