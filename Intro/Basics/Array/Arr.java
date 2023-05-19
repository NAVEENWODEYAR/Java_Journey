
import java.util.*;
public class Arr 
{
    static String ar[] = {"One","Two","Four","Five"};
    public static void main(String args[])
    {
        System.out.println("Arrays in Java.");
        // decalaring an array
        // int [] arr = new int[10];
                int arr[] = {1,2,3,4,5};

                System.out.println("Array elements "+Arrays.toString(arr));         // Arrays.toString() - method of Array class which overrides the toString() of Object class.
                System.out.println("Array elements "+Arrays.toString(Arr.ar));

        // 
    }
}