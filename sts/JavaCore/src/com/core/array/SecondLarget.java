// Write a Java Program to find the second-highest number in an array[using swapping].
package com.core.array;

import java.util.Arrays;

public class SecondLarget
{
	public static void secLargest(int[] arr)
	{
		int largest = 0;
		int secLargest = 0;
		
			for(int i=0; i<arr.length; i++)
			{
				if(arr[i] > largest)
				{
					secLargest = largest;
					largest = arr[i];
				}
				else if(arr[i] > secLargest)
				{
					secLargest = arr[i];
				}
			}
			System.out.println("\nSecond Largset element in the integer array,\n"+secLargest);
			System.out.println("\nLargest element in the integer array,\n"+largest);			
	}
	
	// find the second largest element in the string array,
	static void seconLargestInString(String[] names)
	{
		String largest = "";
		String secLargest = "";
		
		for(int i=0; i<= names.length; i++)
		{
			if(names[i].length() > largest.length())
			{
				secLargest = largest;
				largest = names[i];
			}
			if(names[i].length() > secLargest.length())
			{
				secLargest = names[i];
			}
				
		}
	}
	
	  static public void  main(String[] args) 
	{
		int ar[] = {1,4,43,8,5,4,4,6,87};
		String arr[] = {"Ammu","Boss","Ammie","Denly","Gowri","Gani","Rony","Nandhi"};
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.asList(arr));

		secLargest(ar);
	}
}
