package list;


import java.util.*;
public class LstR 
{
    public static void main(String args[])
    {
        // creating an list
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
               /* System.out.println("Normal Order");
                Iterator itr = lt.iterator();
                    while(itr.hasNext())
                    {
                        System.out.println(itr.next());
                    }*/



                // Iterating in the reverse order
                System.out.println("**************");
                System.out.println("Reverse Order");
                ListIterator<Integer> lll = lt.listIterator();
                    while(lll.hasPrevious())
                {
                    System.out.println(lll.previous());
                }
    }
}