// Create an list & traverse it in both the ways

import java.util.*;
public class ArrLst 
{
    public static void main(String args[])
    {
        // creatin an list
        List<Integer> lt = new ArrayList<Integer>();
                lt.add(5);
                lt.add(1);
                lt.add(10);
                lt.add(2);
                lt.add(3);
                lt.add(4);
                lt.add(9);
                lt.add(8);
                Collections.sort(lt);
                System.out.println("Original list: "+ lt);

                // Iterating in the original list in the normal order
                System.out.println("Normal Order");
                Iterator itr = lt.iterator();
                    while(itr.hasNext())
                    {
                        System.out.println(itr.next());
                    }



                // Iterating in the reverse order
                System.out.println("**************");
                System.out.println("Reverse Order");

 ListIterator<Integer> itrr =lt.listIterator();    

                // ListIterator it = lt.listIterator();
                    while(itrr.hasNext())
                {
                    System.out.println(itrr.previous());
                }
    }
}