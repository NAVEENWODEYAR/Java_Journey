package fileHandling;

import java.io.*;
import java.util.*;

public class CreateFile
{
	public static void main(String args[])
	{
		// File Handling in Java
		// Creating the file
		try
		{
			File f = new File("TuesDay.txt");
			if(f.createNewFile())
			{
				System.out.println("File created in the location-- "+f.getAbsolutePath());
			}
			else
			{
				System.out.println("Unable to create the file.");
			}
			
			// writing to the file
			FileWriter fw = new FileWriter("TuesDay.txt");
						fw.write("Tomarrow 23-05-2023 (Tuesday)."
								+ "Java is the famous programming language.");
						fw.close();
					
			// Reading the file
				Scanner sc = new Scanner(f);
					while(sc.hasNextLine())
					{
						System.out.println("File contains data");
						System.out.println("Content of the file is: "+sc.nextLine());
					}
					sc.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
}