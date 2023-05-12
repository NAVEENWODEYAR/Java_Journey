// Exception Handling in Java 
// throw new Exception name("Error Message")

import java.util.*;
public class Throw1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter your subject 1 marks: ");
            int marks1 = sc.nextInt();

            System.out.println("Enter your subject 2 marks: ");
            int marks2 = sc.nextInt();
            int m = marks1 + marks2;
            try
            {
                if (m > 200)
                throw new ArithmeticException("Marks should be less than 200.");
            }          
            catch(Exception e)
            {
                e.printStackTrace();
            }

            finally
            {
                System.out.println(m);
            }
    }
}