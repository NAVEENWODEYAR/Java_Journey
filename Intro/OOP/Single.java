// Single level inheritance, One class inheriting the properties of other class.,

class Vehicle{

    void fuel() {
        System.out.println("All vehicles needs fuel!");
    }
}

    class Diesel extends Vehicle {

        //System.out.println("Child Class");

        void fuell(){
        System.out.println("We need diesel only!");
         }
    }

        public class Single {

            public static void main(String [] args){

                System.out.println("Main Method");

                Diesel d = new Diesel();

                d.fuel();
                d.fuell();
            }
        }