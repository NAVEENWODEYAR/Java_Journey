// Program to reverse the string without using the built in function..,
package com.data.tech.coding.copy;

import java.util.Scanner;

public class StringReverse2
{
    public static void main(String[] args)
    {
     // Scanner to read the string.,
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to reverse.,");
            String s1 = sc.nextLine();
            String st[] = s1.split("");
                for (int i = st.length-1; i>=0; i--)
                {
                    System.out.print(st[i]);
                }
    }
}
