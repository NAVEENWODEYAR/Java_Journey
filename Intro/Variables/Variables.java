// Different types of variables.,

class Variables{

    // Instance variable, needs object to access.
    int age;
    int id = 1;

    // can be accessed with class name, object and directly.
    static int sal; 
    static String eName = "Ana"; 

    public static void main(String [] args){

        // Local variable, has to be initialized before accessing.
        int a;  
        int aa = 10;

        System.out.println("Local Variable " + aa);
        System.out.println("Static Variable " + eName);

        Variables ob = new Variables();
        System.out.println("Instance Variable " +ob.id  );
    }
}