// Packages - Groping similar classes, interfaces and enums.


package Mypack;
import java.util.*;             // Importing Scanner Class.
    public class Pack{

        public void disp(){
            System.out.println("Know Your age");

                Scanner sc = new Scanner(System.in);        //Creating Scanner Object,
                    System.out.println("Enter Year of Birth :");
                    int yr = sc.nextInt();

                    int age = 2023 - yr;
                    System.out.println("You are "+age+ "Years old");
        }

        public static void main(String [] args){

            System.out.println("Creating Package - Mypack");
        }
    }