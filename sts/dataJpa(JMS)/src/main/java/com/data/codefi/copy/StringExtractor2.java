// Program to extract the numbers,characters and symbols from an string.,
package com.data.codefi.copy;

public class StringExtractor2 {

	public static void main(String[] args) 
	{
		String st= "Naveen@123#$Kumar!456K";
		StringBuilder characters = new StringBuilder();
		StringBuilder numbers = new StringBuilder();
		StringBuilder symbols = new StringBuilder();
		
			
			for(int i=0; i<st.length(); i++)
			{
				if(Character.isAlphabetic(st.charAt(i)))
				{
					characters.append(st.charAt(i));
				}
				else if(Character.isDigit(st.charAt(i)))
				{
					numbers.append(st.charAt(i));
				}
				else
					symbols.append(st.charAt(i));
					
			}
			
			
			System.out.println("Characters,"+characters);
			System.out.println("Numbers,"+numbers);
			System.out.println("Symbols,"+symbols);

			
	}

}
