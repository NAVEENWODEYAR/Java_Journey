// Logical operators.,

import java.util.Scanner;
public class Logic{

    public static void main(String[] args){

        System.out.println("Logical operators");

        Scanner sc = new Scanner(System.in);        // Creating an scanner objet.,

        System.out.println("Enter the value of a");
        int a = sc.nextInt();

        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        System.out.println("Enter the value of c");
        int c = sc.nextInt();


        System.out.println( a>b && a>c);
        System.out.println(b);

        
    }
}