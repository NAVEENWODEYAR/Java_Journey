// Program to swap the numbers.,
package com.data.tech.coding.copy;

public class SwapNumbers
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 10;

        // swapping using third variable.,
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}
