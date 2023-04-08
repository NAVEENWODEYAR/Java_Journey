// Multilevel inheritance.,

class A{
    void say(){
        System.out.println("Iam From the Class A");
    }
}
    class B extends A{
        void show(){
            System.out.println("Iam From the Class B");
        }
    }
        class C extends B{
            void print(){
                System.out.println("Iam From the Class C");
            }
        }

            public class Multilevel{
                public static void main(String[] args){
                    
                    System.out.println("Main method");
                    C c = new C();                                  // Creating the object of the class C.,

                    c.print();
                    c.show();
                    c.say();

                }
            }