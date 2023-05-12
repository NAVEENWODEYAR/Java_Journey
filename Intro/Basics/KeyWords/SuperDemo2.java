// super to refer immediate parent class instance variables.

    class Employee
        {
            int e_Id = 100;
            String e_Type = "Permanent";

                public void disp()
                {
                    System.out.println("*******");
                    System.out.println("Employee Class Method.");
                    System.out.println("Employee Id: " + this.e_Id);
                }
        }

            class Manager extends Employee
            {
                int e_Id = 50;
                String e_Type = "Contract";
                    public void disp()
                    {
                        System.out.println("Manager class Method.");
                        System.out.println("Employee Type: "+ super.e_Type);            // prints permanent
                        System.out.println("Employee Type: "+ e_Type);                  // prints contract
                            super.disp();                                               // invoking the parent class method
                    }
            }
        
        public class SuperDemo2 
        {
            public static void main(String [] args)
            {
                // object creation
                System.out.println("Accessing the parent class instance variables.");
                    Manager m1 = new Manager();
                System.out.println(m1.e_Id);
                    m1.disp();
            }
        }