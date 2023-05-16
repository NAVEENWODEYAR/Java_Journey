package exceptionHandling;

import java.util.Scanner;
public class Usr_Exception extends UserException {

	Usr_Exception(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// User-defined Exception
		
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age ");
			int age = sc.nextInt();
				if(age < 20)
				{
					throw new UserException("age");
				}
				else
				{
					System.out.println("Go get job as soon as possible");
				}
		}
		catch(Exception e)
		{
			System.out.println("User Exception handled");
			e.printStackTrace();
		}

	}
}

	class UserException extends Exception
	{
		String name;
		UserException(String name)
		{
			name = name;
		}
		
		public String toString()
		{
			return("Exception type is: "+ name);
		}
	}