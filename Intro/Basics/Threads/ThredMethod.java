// Thread methods.

    class ThredMethod extends Thread{                 // Runnable is a interface
        public void run(){
            for (int i=0; i<=2; i++){
                try{
                    Thread.sleep(5000);
                }
                catch (Exception e){
                    System.out.println(e);
                }
                System.out.println("Thread  "+i);
            }
        }
        public static void main(String [] args){
            ThredMethod th = new ThredMethod();         // Creating the object to access the methods.
                th.start();

                // getName()
                System.out.println("Thread Name " +th.getName());

                // setName()
                th.setName("T");
                System.out.println("Thread Name " +th.getName());

                // getPririority()
                System.out.println("Thread Pririority " +th.getPriority());

                // setPriority
                th.setPriority(10);
                System.out.println("Thread Pririority " +th.getPriority());

                // isAlive()
                System.out.println("Thread Pririority " +th.isAlive());

        
        }   
    }
