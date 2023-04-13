// Multi Level Inheritance.,

    class Electronics{
        String name = "Electronics";
        int slNumber = 55;
            void disp(){
                System.out.println();
                System.out.println("Elcectronic Gadgets are very essential");
                System.out.println("Category:" +name);
                System.out.println("Serial Number:" +slNumber);
            }
        }

                class Mobile extends Electronics{
                    String name = "Mobile";
                    int slNumber = 22;
                        void displ(){
                            System.out.println();
                            System.out.println("Mobile are mandatory electronic gadgets");
                            System.out.println("Category:" +name);
                            System.out.println("Serial Number:" +slNumber);
                        }
                }

                        class Laptop extends Electronics{
                            String name = "Laptop";
                            int slNumber = 88;
                                void display(){
                                    System.out.println();
                                    System.out.println("Laptops became very essentail after covid");
                                    System.out.println("Category:" +name);
                                    System.out.println("Serial Number:" +slNumber);
                                }
                        }         

    class Inheritanc{

        public static void main(String [] args){

            Laptop obj = new Laptop();

            obj.disp();
            //obj.displ();
            obj.display();

        }
    }