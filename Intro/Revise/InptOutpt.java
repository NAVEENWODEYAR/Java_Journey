// Input and output Statements in java.,

    import java.util.*;     // Scanner class is present in util.,
    class InptOutpt {

        public static void main (String [] args){

            Scanner sc = new Scanner(System.in);    // Creating an Scanner Object;
            
            System.out.println("Enter your Employee Id: ");
            int eId = sc.nextInt();                 // nextInt() - reads integer.
            //System.out.println("Employee Id: "+eId);
            
            System.out.println("Enter your Employee Name: ");
            String eName = sc.next();               //next() - reads string.
            //System.out.println("Employee Name: " + eName);


        }
    }