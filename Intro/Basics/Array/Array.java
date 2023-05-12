// Array is immutable in java.,

    class Array{

        public static void main(String [] args){

            // creating an array,.
            int [] a = {1,2,3,4,5,6,7,8};

            System.out.println(a);
            // Finding array size using length attribute.
            int ln = a.length;
            System.out.println("The size of the array is: "+ln);
                
                // for each to iterate the array elements.
                for (int ele : a){
                    System.out.println("The elements of the array : " +ele);
                            System.out.println();                   
                    }

                    // to modify the array elements.,

                    a[0] = 0;
                    a[7] = 7;

                            System.out.println();
                            
                        for (int el:a){
                            System.out.println();
                            System.out.println("Array after the udation "+ el);
                        }
        }
    }