package com.core.string;

public class SeperateDS2 
{
	public static void extractString()
	{
		String st= "Naveen@123#$Kumar!456K";
		StringBuilder chars = new StringBuilder();
		StringBuilder numbers = new StringBuilder();
		StringBuilder symbols = new StringBuilder();
		
			for(int i=0; i<st.length(); i++)
			{
				if(Character.isAlphabetic(st.charAt(i)))
				{
					chars.append(st.charAt(i));
				}
				else if(Character.isDigit(st.charAt(i)))
				{
					numbers.append(st.charAt(i));
				}
				else
					symbols.append(st.charAt(i));
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
