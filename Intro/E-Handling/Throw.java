// Exception Handling in Java 
// throw new Exception name("Error Message")
import java.util.*;
public class Throw
{
    public static void main(String args[])
    {
        // throws is used to define an exception explicitely

        Scanner sc = new Scanner(System.in);                // Scanner object to read the input from the user
            System.out.println("Please enter your age: ");    
            int age = sc.nextInt();

                if(age <= 18)
                {
                    throw new ArithmeticException("You are not eligible to vote!"); 
                }
                else
                {
                    System.out.println("Welcome to vote.");
                }
    
    }
}