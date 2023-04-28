// super is a keyword to refer the parent/super class variables, constructors & mehods. 

    class Car 
    {
        int car_Id;
        String car_Type;
            // Constructor
            Car(int i, String t)
            {
                    this.car_Id = i;
                    this.car_Type = t;
                System.out.println("Car Class Constructor!");
            }
    }

    class SportsCar extends Car
    {
        int car_Id;
        String car_Name;
            // constructor
            SportsCar(int i, String nm, int a, String b)
            {
                super(a,b); // invoking the parent class constructor with the parameters.
                
                    this.car_Id = i;
                    this.car_Name = nm;
                System.out.println("SportsCar class Constructor!");
            }
    }

    public class SuperDemo
    {
        public static void main(String args[])
        {
            System.out.println("Accessing the parent class using super.");
            // Child class object creation
                SportsCar c1 = new SportsCar(14,"Bugati",1,"Sports");

        }
    }