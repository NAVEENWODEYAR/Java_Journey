package pack1.com.oops;

public class Manager extends Employee {
	// private variable.
	private String name;
	private double pay_Scale;
	
	// setters and getters for these variables.
			public String getName() 
			{
				return name;
			}
			public void setName(String name) 
			{
				this.name = name;
			}
			public double getPay_Scale()
			{
				return pay_Scale;
			}
			public void setPay_Scale(double pay_Scale) 
			{
				this.pay_Scale = pay_Scale;
			}
			
	public void cal_Sal()
	{
		double sal = this.getBasic_Sal();
				sal = sal * this.getPay_Scale();
		System.out.println("Employee Type: "+ "Manager");
		System.out.println("Employee Name: "+ this.getName());
		System.out.println("Employee Salary: "+ sal);
	}			
}
