package pack1.com.oops;

public class Employee extends Labour {
	
	// private variables.
	private int emp_Id;
	private double basic_Sal;
		
		// setters and getters to access the private variables.
				public int getEmp_Id() {
					return emp_Id;
				}
			
				public void setEmp_Id(int emp_Id) {
					this.emp_Id = emp_Id;
				}
			
				public double getBasic_Sal() {
					return basic_Sal;
				}
			
				public void setBasic_Sal(double basic_Sal) {
					this.basic_Sal = basic_Sal;
				}
				
		@Override
		public void cal_Sal() {
			// TODO Auto-generated method stub
			
		}

}
