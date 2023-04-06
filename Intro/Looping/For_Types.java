// For loop and it's types.,
// Simple for loop, for-each loop, labelled for loop.,

public class For_Types{

    public static void main(String[] args){

        int n = 2;
        System.out.println("Multiplication Table of " + n);
        for(int i = 1; i<=10; i++){
            
            System.out.println(n +"X" + i + "=" + n*i );
        }


        // nested for looop.,
        // for (int i = 1; i <= 5; i++){
        //     for (int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // // nested for loop.,
        // for (int i = 1; i <=5; i++){
        //     for (int j = 5; j >= i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // labelled for loop.,

        a:
            for (int i = 1; i <= 5; i++){
                bb:
                    for (int j = 1; j <= 5; j++){
                        if (i ==3 && j == 4){
                            break a;
                        }
                        System.out.println(i + "" + j);
                    }
            }
    }
}