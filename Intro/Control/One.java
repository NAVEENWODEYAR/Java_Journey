// Java Control Statements.,
// Java If statement is a decession making statement.,

import java.util.Scanner;                       // Importing Scanner class.,
class One {



      public static void  marriage(){
             System.out.println("If Statement Demo!");

             Scanner sc = new Scanner(System.in);             // Creating Scanner object.,
             System.out.println("Enter your age");int age = sc.nextInt();
             if (age >= 24){

                 System.out.println("You can Marry!");
             }
             else {
                System.out.println("You have to study!");
             }

         }

    public static void main (String [] args){

        Scanner scn = new Scanner(System.in);   // Creating a scanner object.,

        // System.out.println("Enter name, age and salary :");
        // String name = scn.nextLine();              // Reading user input.,
        // int age = scn.nextInt();                    // Reading int value
        // int sal = scn.nextInt();                      // Reading int value.,

        // System.out.println("Java Scanner Object Demo!");
        // System.out.println("User Name =" +  name );
        // System.out.println("User Age = " + age);
        // System.out.println("User Salary = " + sal);


        marriage();
    }

}