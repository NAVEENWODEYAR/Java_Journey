package com.data.tech.coding.copy.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrLst
{
    public static void main(String[] args)
    {
     // ArrayList object.,
        ArrayList al = new ArrayList();
                    al.add("One");
                    al.add("Two");
                    al.add("Three");
                    al.add("Four");
                    al.add("Five");
            System.out.println(al);
        try {
            ArrayList<Integer> a = (ArrayList<Integer>) Arrays.asList(1,2,3,4,5,6,7,8);
            System.out.println(a);
        }
        catch (Exception e)
        {
//            e.printStackTrace();
            e.getMessage();
            e.getCause();
            e.getStackTrace();
            e.getClass();
            e.getLocalizedMessage();
        }
    }
}
