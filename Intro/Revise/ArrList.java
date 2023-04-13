// ArrayList is a class uses dynamic array for storing elements.,

    import java.util.*;                             // Importing ArrayList class.,
    class ArrList{

        public static void main(String [] args){

            ArrayList<String> li = new ArrayList<String>();         // Creating ArrayList,
                li.add("Ana");                                           // adding objects using add();
                li.add("Bella");                                           // adding objects using add();
                li.add("Carmela");                                           // adding objects using add();
                li.add("Diana");                                           // adding objects using add();
                li.add("Eric");                                           // adding objects using add();

                System.out.println(li);
                //System.out.println(li["Eric"]);
                //System.out.println(li[4]);
        }   
    }