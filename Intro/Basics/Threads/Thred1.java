// Thread in java using the using Runnable interface.

    class Thred1 implements Runnable{                 // Runnable is a interface
        public void run(){
            for (int i=0; i<=5; i++){
            System.out.println("Thread  "+i);
            }
        }
        public static void main(String [] args){
            Thred t = new Thred();
            Thread tt = new Thread(t);
            tt.start();
        }   
    }
