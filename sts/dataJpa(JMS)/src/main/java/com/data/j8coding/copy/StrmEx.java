package com.data.j8coding.copy;

import java.util.Arrays;
import java.util.List;

public class StrmEx 
{
	public static void main(String[] args) 
	{
		System.out.println("Stream is sequence of elements from an sourcewhich supports the data processing.,");
		List<String> list = Arrays.asList("Annie","Rooney","Mooney","Nancy","Bennie");
			for(String st: list)
			{
				if((st.length() >= 5))
				{
					System.out.println(st.toUpperCase());
				}				
			}
		
	}

}
