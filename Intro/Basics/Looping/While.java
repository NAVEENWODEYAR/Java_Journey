// // While loop in java.,


// import java.io.Console;                                 // Using io Console class to get the user input.,
// public class While {

//     public static void main(String [] args){

//         // System.out.println("While loop");

//         // while (true){                                       // Infinate while loop.,
//         //     System.out.println("Infinate Loop using while");
//         // }


//         Console cn = System.console();
//         System.out.println("Please Enter Your Age:");
//         String aa = cn.readLine("");

//         int age = Integer.parseInt(aa);

//         while (age <= 18){

            
//             System.out.println("You can't marry!..,");
//         }

//     }
// }



import java.io.Console;

public class While {
    public static void main(String[] args) {
        Console cn = System.console();
        System.out.println("Please Enter Your Age:");
        String aa = cn.readLine("");
        int age = Integer.parseInt(aa);
        
        while (age <= 18) {
            System.out.println("You can't marry!..,");
            System.out.println("Please Enter Your Age:");
            aa = cn.readLine("");
            age = Integer.parseInt(aa);
        }

        System.out.println("You can marry!..,");
    }
}
