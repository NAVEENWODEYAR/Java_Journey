package com.core.string;

public class SeperateDS 
{
	public static void extractString()
	{
		String st= "Naveen@123#$Kumar!456K";
		StringBuilder chars = new StringBuilder();
		StringBuilder numbers = new StringBuilder();
		StringBuilder symbols = new StringBuilder();
		
			for(char c: st.toCharArray())
			{
				if(Character.isAlphabetic(c))
				{
					chars.append(c);
				}
				else if(Character.isDigit(c))
				{
					numbers.append(c);
				}
				else
					symbols.append(c);
			}
			System.out.println("Characters in the string - "+chars);
			System.out.println("Numbers in the string - "+numbers);
			System.out.println("Symbols in the string - "+symbols);

	}
	public static void main(String[] args) 
	{
		extractString();
	}

}
