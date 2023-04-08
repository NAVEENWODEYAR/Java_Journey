// Constructor is a special member function which invokes the object automatically.,

public class Constructor {

        int id;
        String name;

        void display(){
            System.out.println(id + ": " + name);
        }

    public static void main(String[] args){

        // Constructor can't be abstrac, final,static and sunchronized.,

            Constructor c = new Constructor();
            Constructor c1 = new Constructor();

                c.display();
                c1.display();

    }
}