// Exception Handling in Java 

public class Exception 
{
    public static void main(String args [])
    {
        // nested try block
        try
        {
            // int[] arr = {1,2,3,4,5};
            // System.out.println(arr[5]);

                try
                {
                    int a = 10/0;
                }
                catch (ArithmeticException e)
                {
                    System.out.println("Check the code, you idiot");
                    e.printStackTrace();
                }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
    }
}