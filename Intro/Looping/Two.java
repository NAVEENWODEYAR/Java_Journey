// For-each Loop., To traverse the array or collection of elements.,

public class Two {
    public static void main(String[] args){
        
        System.out.println("For-each Loop");

        int arr[] = {1,2,3,4,5};             // Creatina an array of int type.,

        System.out.println(arr);
        System.out.println(arr[4]);

        for(int ele:arr){                   // For each loop to print the elements of the arry., for(data_type var : array_name/collection_name)
            System.out.println(ele);
        }
    }
}