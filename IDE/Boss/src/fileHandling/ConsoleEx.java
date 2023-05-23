package fileHandling;

import java.io.*;
public class ConsoleEx {

	public static void main(String[] args) {
		// Console class is be used to get input from console. It provides methods to read texts and passwords
		Console c = System.console();
		System.out.println("Enter your name");
		String str = c.readLine("Name", "ID");
		System.out.println(c);

		String text=System.console().readLine();
		System.out.println("Text is: "+text);
	}

}
