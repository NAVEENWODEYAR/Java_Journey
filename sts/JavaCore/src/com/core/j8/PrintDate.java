//Print current date and time in Java 8 Date and Time API?

package com.core.j8;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;

public class PrintDate 
{

	public static void main(String[] args) 
	{
		System.out.println("Today- "+LocalDate.now());
		System.out.println("Time- "+LocalTime.now());
	}

}
