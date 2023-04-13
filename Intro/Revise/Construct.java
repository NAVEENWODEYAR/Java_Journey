// Constructor program.,

    class Construct{

        int id;
        String name;
        // Constructor 
        Construct(){
            id = 1;
            name = "Ana";
        }

        //Parameterized Constructor.,
        Construct( int i, String nam){
                id = i;
                name = nam;

        }
        public static void main(String [] args){

            Construct c = new Construct(2,"Bella");
            Construct c1 = new Construct();

            System.out.println("Employee Id:"+c1.id);
            System.out.println("Employee Name:"+c1.name);
            System.out.println();
            System.out.println("Employee Id: "+c.id);
            System.out.println("Employee Name: "+c.name);

        }
    }