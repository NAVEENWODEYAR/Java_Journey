// Switch statement 
// Switch statement is similar to if-else-if statement . it improves the readibility of the code/ program.,

import java.util.Scanner;                // Importin Scanner Class.,
class Four{

    public static void main (String [] args){

        Scanner scc = new Scanner(System.in);       // Creating an scanner object.,

        System.out.println("Enter you age :");
        int age = scc.nextInt();

        switch(age)  {

            case 18:
                System.out.println("You have to study!");
                break;

            case 24:
                System.out.println("You can start searching for bride");
                break;

            case 30:
                System.out.println("You have to engae as soon as possible");
                break;
            default:
                System.out.println(age + " is not a proper age to discuss about this topic!");
        }

    }
}