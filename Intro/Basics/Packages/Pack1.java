// Packages - Groping similar classes, interfaces and enums.


package Mypack1;
import Mypack.Pack;

    class Pack1{
        private void disp(){
            System.out.println("Method of the Package Mypack1");
        }

        public static void main(String [] args){
            System.out.println("Creating Package - Mypack1");
                 new Pack().disp();                      // Calling method through the object,
        }
    }