// check weather given string is the rotation of the string
package com.data.tech.coding.copy;

public class StringRotation
{
    public static void main(String[] args)
    {
        String s1 = "ABCDE";
        String s2 = "EEDCBA";
        System.out.println(isRotation(s1,s2));
    }
    public static boolean isRotation(String a, String b)
    {
        if ( a.length() == b.length() && (a+a).indexOf(b) != 1)
        {
            return true;
        }
        else
        {
            return  false;
        }
    }
}
