// Thread in java using the Thread class

    class Thred extends Thread{                 // Thread is a class
        public void run(){
            for (int i=0; i<=5; i++){
            System.out.println("Thread  "+i);
            }
        }
        public static void main(String [] args){
            new Thred().start();
        }   
    }
