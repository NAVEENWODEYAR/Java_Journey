// Java array, It is colectiion of homogeneous elements and immutable.,

public class Aray{

    public static void main(String [] args){
        System.out.println("Java Array ");

        int[] a = {1,2,3,4,5,6,7,8};            // Declating an arraof type int.,

        System.out.println(a);                  // Prints the address of the array I@hexadecimal number.,
        System.out.println(a[5]);               // Prints the element stored at the index 5 ie,6.,

            for (int ele : a)                   // For-each loop,To print all the elements present in the array, 
            {
                System.out.println("Element: " + ele);
            }

        a[4] = 90;                              // Updating the value of the element at index no 4.,
        System.out.println(a[4]);
        System.out.println(a.length);           // Checking the array size using lenght().,
    }
}