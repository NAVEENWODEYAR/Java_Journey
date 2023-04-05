// if-else ladder to for grading system for students.,

import java.util.Scanner;
public class Five{
    public static void main(String[] args){

        Scanner sn = new Scanner(System.in);        // Creating an scanner object.,

        System.out.println("Enter your marks:");
        int marks = sn.nextInt();

        if (marks <= 35) {
            System.out.println("Fail");
        }
            else if (marks >= 35  && marks <= 50){
                System.out.println("C");
            }
                else if (marks >=50 && marks <= 64){
                    System.out.println("B");
                }
                    else if ( marks >=64 && marks <= 90){
                        System.out.println("A");
                    }
                        else if (marks >=90 && marks <=100){
                            System.out.println("A+");
                        }

                        else {
                            System.out.println("Enter the proper marks !");
                        }
    }
}
