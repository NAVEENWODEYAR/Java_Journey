// Java progama to check weather year is leap yera or not!.,

public class Leap{

    public static void main(String[] args){

        int year = 2000;

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 ==0))
        {
            System.out.println("The year " + year +  "Leap year.,");
        }
        else {
            System.out.println("Not a leap year.");
            }


           String output = (((year % 4 == 100) && (year % 100 !=0))||(year % 400 == 0))?"Leap year":"Normal year";      // Using Ternery operator.,
           System.out.println(output);
    }
}