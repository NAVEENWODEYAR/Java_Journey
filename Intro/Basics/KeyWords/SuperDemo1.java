//  super() has to be placed inside the  first line of the constructor  body only.

    class Account
    {
        int id;
        String type;
        // constructor
            Account(int i, String t)
            {
                    this.id = i;
                    this.type = t;
                System.out.println("Account class constructor.");
            }

            public void disp()
            {
                System.out.println("Account class method.");
            }

    }

    class SAccount extends Account
    {
        int id;
        String category;
        // constructor
            SAccount(int i, String c, int a, String t)
            {
                super(a,t);       // invoking the parent class constructor
                super.disp();
               // this.id = super.id;
                    this.id = i;
                    this.category = c;
                System.out.println("SAccount class Constructor.");    
            }

             public void disp()
            {
                System.out.println("SAccount class method.");
            }
    }

    public class SuperDemo1
    {
        public static void main(String args[])
        {
            System.out.println("****super****");
                SAccount s1 = new SAccount(1,"Platinum",9,"Savings");
            
                System.out.println(s1.id);
                System.out.println(s1.category);
                        s1.disp();
        }
    }