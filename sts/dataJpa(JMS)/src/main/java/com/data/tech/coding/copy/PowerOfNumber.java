package com.data.tech.coding.copy;


import java.util.Scanner;

// Program to find the power of a number;
public class PowerOfNumber
{
    public static void main(String[] args)
    {
        // Scanner object.,
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number to find the power.,");
                int a = sc.nextInt();
        System.out.println("Enter the second base to find the number.,");
                int b = sc.nextInt();
        System.out.println("Power of the number->  "+Math.pow(a,b));
    }
}
