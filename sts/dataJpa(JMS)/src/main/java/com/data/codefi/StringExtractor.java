// Program to extract the numbers,characters and symbols from an string.,
package com.data.codefi;

public class StringExtractor {

	public static void main(String[] args) 
	{
		String st= "Naveen@123#$Kumar!456K";
		StringBuilder characters = new StringBuilder();
		StringBuilder numbers = new StringBuilder();
		StringBuilder symbols = new StringBuilder();
		
			for(char c:st.toCharArray())
			{
				if(Character.isAlphabetic(c))
						{
							characters.append(c);
						}
				else if(Character.isDigit(c))
				{
					numbers.append(c);
				}
				
				else
					symbols.append(c);
			}
			
			System.out.println("Characters,"+characters);
			System.out.println("Numbers,"+numbers);
			System.out.println("Symbols,"+symbols);

			
	}

}
