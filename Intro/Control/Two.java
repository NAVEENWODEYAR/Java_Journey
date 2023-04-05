// If-else ladder statements.,
import java.util.Scanner;               // Importing the Scanner class.,

class Two {

    public static void marriage(){
        Scanner sc = new Scanner(System.in);        // Creatin a scanner object.,

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter yor salary:");
        int sal = sc.nextInt();

        if (age >= 25){

            System.out.println(" You can start searching the bride");
        }
        else if(sal >= 50000){
            System.out.println(" You can marry!");
        }
        else {
            System.out.println("Try to work hard !");
        }
    }
    public static void main(String [] args){

        marriage();
        
        }
}