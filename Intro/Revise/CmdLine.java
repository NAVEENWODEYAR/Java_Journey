// Command line argument is used to read input from the user while executing the code.,

    class CmdLine{

        public static void main(String [] args){

            int a,b,c;

            a = Integer.parseInt(args[0]);  
            b = Integer.parseInt(args[1]);
                c = a + b;
                System.out.println("Sum of two numbers is : "+c);
        }
    }