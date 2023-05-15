// Collection FrameWork 

import java.util.*;
public class ArrLst 
{
    public static void main(String args[])
    {
        System.out.println("******ArrrayList*****");
            ArrayList<Integer> arl = new ArrayList<Integer>();
            System.out.println(arl);

            // adding the elements usig add()
            arl.add(1);
            arl.add(2);
            arl.add(3);
            arl.add(4);
            System.out.println(arl);

            // retriving the elements.
            System.out.println(arl.get(3));

            // adding at the particular index
            arl.add(4,5);
            System.out.println(arl);

            // removing the elements using remove
            arl.remove(1);
            System.out.println(arl);

            arl.add(4);
            arl.add(8);
            arl.add(7);
            arl.add(1);
            // size 
            System.out.println(arl.size());

            // sorting using Collections.sort()
            Collections.sort(arl);
            System.out.println("Sorted ArrayList: "+ arl);

            // remove all the elements clear();
            arl.clear();
            System.out.println(arl);

    }
}
