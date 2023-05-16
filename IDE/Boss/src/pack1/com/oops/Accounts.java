package pack1.com.oops;

public class Accounts {

	public static void main(String[] args) {
		Manager m = new Manager();				// Manger class object creation. 
				m.setEmp_Id(32145);
				m.setBasic_Sal(25000.00);
				m.setName("Nancy");
				m.setPay_Scale(4.00);
				m.cal_Sal();
				
			System.out.println("**********");
		Developer d = new Developer();			// Developer class object creation.
				d.setEmp_Id(4563);
				d.setBasic_Sal(20000.00);
				d.setName("Magneta");
				d.setPay_Scale(4.00);
				d.cal_Sal();
	}

}
