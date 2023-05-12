// Exception Handling in Java 
// throw new Exception name("Error Message")

public class Throw2
{

     void a()
        {
            System.out.println("Code to cause the error.");
            int a = 1/0;
        }

        void b()
        {
            System.out.println("Invokes the method - a()");
            a();
        }
        
        void c()
        {
            System.out.println("Invokes the method - b()");
            b();
        }

        void d()
        {
            System.out.println("Invokes the method - c()");
            try
            {
                c();
            }
            catch(ArithmeticException a)
            {
                a.printStackTrace();
                System.out.println("This method handles the exception.");
            }
        }
    public static void main(String args[])
    {  
        // Exception propagation
        Throw2 ob = new Throw2();
                ob.d();
       
    }
}