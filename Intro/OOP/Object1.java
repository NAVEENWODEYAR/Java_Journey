// Objects in Java.,

public class Object1{

        public void fact(int n){
            int fact = 1;
                for (int i = 1; i <= n; i++){
                    fact = fact * i;
                }
                    System.out.println("Factorial of the number " + n + " is " + fact);
        }
        
    public static void main (String[] args){

        System.out.println("Objects can be created in different ways.,");

        // Anonymous object , an object without name is called as an anonymous object.,
            new Object1().fact(5);


    }
}