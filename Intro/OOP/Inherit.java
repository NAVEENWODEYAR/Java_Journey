// Inheritance is one of the feature of OOP.,
// method overloading can be achieved,. We use keyword @extends@ for inheritance.,

class Dept {

    int team = 101;
    String department = "Production";

}
   
    public class Inherit extends Dept{              // Inheriting the parent class Dept @extends Dept@.,

      int emp_Id = 101;
        String name = "Bhaskar";        
    public static void main(String args[]){

        Inherit e = new Inherit();                      // Creating the object of child class.,

        System.out.println("Employee Team id:"+ e.team);
        System.out.println("Employee Department Name: " +e.department);
        System.out.println("Employee ID :" + e.emp_Id);
        System.out.println("Employee  Name: " +e.name);
        
    }
}