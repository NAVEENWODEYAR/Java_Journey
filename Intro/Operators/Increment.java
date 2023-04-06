// Operators in Java., Increment & Decrement operators.,

public class Increment{

    public static void main(String args[]){
        
        // increment operators are of two types, Post increment x++( first assigns the valure then increments the value) Pre incremet ++x( first increments the value then assigns it).,
        int x = 1;
        System.out.println(x++);        // 1.,
        System.out.println(x);          // 2.,

        int y = ++x;                    // 3.,
        System.out.println(y);          // 3.,


       
    //    final int c = 2;
    //    System.out.println(c++);         // Increment/Decrement is not applicable to final variables.,

       char v = 'a';                        // Increment/Decrement is  applicable to all primitive variables except boolean.,
       System.out.println(++v);

       boolean b = true;
       System.out.println(b++);                // Increment/Decrement is not applicable to boolean values.,

    }   
}