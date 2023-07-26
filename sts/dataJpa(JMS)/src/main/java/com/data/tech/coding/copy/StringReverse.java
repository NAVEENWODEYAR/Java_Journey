// Program to reverse the string without using the built in function..,
package com.data.tech.coding.copy;

public class StringReverse
{
    public static void main(String[] args)
    {
     // String is an immutable object.,
     String st = "SpringBoot..,";
        System.out.println(st.repeat(100));

     // creating an stringBuilder object..,
     StringBuilder s1 = new StringBuilder();
        System.out.println("Original string-> "+st);
                    s1.append(st);
                    s1.reverse();
             System.out.println("Reversed string-> "+s1);
    }
}
