// Program to reverse the string without using the built in function..,
package com.data.tech.coding.copy;

public class StringReverse1
{
    public static void main(String[] args)
    {
     // String is an immutable object.,
     String st = "SpringBoot..,";
     char ch[] = st.toCharArray();
        for (int i=st.length()-1; i>0; i--)
        {
            System.out.print(ch[i]);
        }
    }
}
