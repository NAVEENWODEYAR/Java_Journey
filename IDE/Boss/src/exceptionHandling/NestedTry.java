package exceptionHandling;

public class NestedTry {

	public static void main(String[] args) {
		// Nested try
		try
		{
			try
			{
				int a = 50/0;
			}
			catch(ArithmeticException a)
			{
				System.out.println("Arithmetic Exception, Idiot you can't devide the number by zero.");
				a.getMessage();
			}
			
			try
			{
				int i = Integer.parseInt("Five");
			}
			catch(NumberFormatException n)
			{
				System.out.println("Numberformat Exception, can't type cast the string to int.");
				n.getMessage();
			}
			
			try
			{
				int[] a = {1,2,3,4,5};
				System.out.println(a[4]);
				System.out.println(a[10]);
			}
			catch(ArrayIndexOutOfBoundsException ar)
			{
				System.out.println("You idiot,");
				ar.printStackTrace();
			}
		}
			
		catch(Exception e)
		{
			System.out.println("Nested Try block");
		}

	}

}
