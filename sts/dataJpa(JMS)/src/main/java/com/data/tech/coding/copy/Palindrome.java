// To check weather the given string is palindrome or not.,
package com.data.tech.coding.copy;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the string to check for palindrome?");
//            String s2 = sc.nextLine();
        String s1 = "MALAYALAM";
        String revS1 = "";
                for ( int i= s1.length()-1; i>=0; i--)
                {
                    revS1 = revS1 + s1.charAt(i);
                }
        System.out.println(revS1);
        if (s1.equals(revS1))     // contenet comparision
//            if (s1 == s2)         // reference comparision.,
        {
            System.out.println("Given string is the palindrome.,");
        }
        else
        {
            System.out.println("Not an palindrome.,");
        }
    }
}
