package com.core.interviewquesions;

public class PalindromeInt
{
	public static boolean isPalindrome(int num) 
	{
        // Handle negative numbers (they cannot be palindromes)
        if (num < 0) {
            return false;
        }

        int original = num;
        int reversed = 0;

        // Reverse the integer
        while (num != 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
	}
	public static void main(String[] args) 
	{
		isPalindrome(26324);
	}
	
}
