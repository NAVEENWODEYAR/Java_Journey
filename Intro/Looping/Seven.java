    // Java nested switch statement.,

import java.util.Scanner;
public class Seven{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);                // Creating Scanner objects.,
        Scanner scc = new Scanner(System.in);

        System.out.println("Enter your Branch:");
        String c = sc.nextLine();                     // Input from the user through Scanner object sc.,

        System.out.println("Enter the year:");
        int yr = scc.nextInt();                     // Input from the user through scanner object scc.,

        switch (yr){

            case 1:
                System.out.println("General Subjects for all the students ie,, Kannda, English,Physics,Chemistry,Mathematics and Biology.");
                break;
            case 2:
                switch (c){                     // Nested switch statement.,
                    case "S":
                        System.out.println("Science and other streams are available for you.,");
                        break;
                    case "C":
                        System.out.println("Management and Accountig streams are available for you.");
                        break;
                    case "A":
                        System.out.println("You guys are going to rule both Science and other streams.,");
                        break;
                    default :
                        System.out.println("Enter the proper stream.,");
                        break;
                }
            default :
                System.out.println("Enter proper year of college.");
                break;
        }

    }
}