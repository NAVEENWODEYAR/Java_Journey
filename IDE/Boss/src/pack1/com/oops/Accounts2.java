package pack1.com.oops;

public class Accounts2 {

	public static void main(String[] args) {
		Manager m = new Manager();				// Manger class object creation. 
				m.setEmp_Id(32145);
				m.setBasic_Sal(25000.00);
				m.setName("Oria");
				m.setPay_Scale(4.00);
				AccountService.sal(m);
				
			System.out.println("**********");
		Developer d = new Developer();			// Developer class object creation.
				d.setEmp_Id(4563);
				d.setBasic_Sal(20000.00);
				d.setName("Mayer");
				d.setPay_Scale(4.00);
				AccountService.sal(d);
	}

}
