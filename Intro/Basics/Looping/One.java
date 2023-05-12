// For loop in Java .,

class One {
    public static void main(String[] args){
        System.out.println("For Loop to print the sum of n numbers.,");

        int sum = 0;

        for(int i = 0; i <= 10; i++){

            if(i == 7){                 // Using break to to break the for loop.,
                break;
            }

           
            sum = sum + i;

            if (i == 2)
            {
                continue;               // Using continue to skip at particular point in for loop.,
            }
             System.out.println(i);
            
        }
         System.out.println("The sum of first 10 natural numbers = " + sum);
    }
}