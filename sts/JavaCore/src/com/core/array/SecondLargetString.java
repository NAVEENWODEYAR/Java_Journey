// Write a Java Program to find the second-largest string in an array[Swapping].
package com.core.array;

import java.util.Arrays;

public class SecondLargetString
{
	public static void secLargest(String[] arr)
	{
			String largest = "";
			String secLargest = "";
			
				for(int i=0; i<arr.length; i++)
				{
					if(arr[i].length()> largest.length())
					{
						secLargest = largest;
						largest = arr[i];
					}
					else if(arr[i].length()>secLargest.length())
					{
						secLargest = arr[i];
					}		
				}
				System.out.println("Original Array "+Arrays.asList(arr));
				System.out.println("Largest string(length) in the array "+largest);
				System.out.println("Second largest string in the Array "+ secLargest);

	}
	  static public void  main(String[] args) 
	{
		String ar[] = {"1","4","643","8","5","4","4","6","87"};
		String arr[] = {"Ammu","Boss","Ammie","Denly","Gowri","Gani"};
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.asList(arr));

		secLargest(ar);
	}

}
