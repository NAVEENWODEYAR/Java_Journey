// Constructor Overloading.,

public class Constructor1 {

    int id;
    String name;
    int age;

    Constructor1(int i, String n) {
        id = i;
        name = n;
    }

    Constructor1(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display (){
        System.out.println(id +""+ name +""+ age);
    }
    
    public static void main (String  [] args){

            Constructor1 c = new Constructor1(1, "Bhas",24);
            Constructor1 cc = new Constructor1(2,"Monu",20);

            c.display();
            cc.display();

    }
}