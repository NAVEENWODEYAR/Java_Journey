package com.data.j8coding;

public class Employee 
{
	private int eAge;
	private String eName;
	private String eDept;
	private String eGender;
	
		// default constructor
		public Employee()
		{
			super();
		}
		// parameterized constructor
		public Employee(int eAge, String eName, String eGender, String eDept) 
		{
			super();
			this.eAge = eAge;
			this.eName = eName;
			this.eGender = eGender;
			this.eDept = eDept;
		}
		// getter() & setter()
		public int geteAge() {
			return eAge;
		}
		public void seteAge(int eAge) {
			this.eAge = eAge;
		}
		public String geteName() {
			return eName;
		}
		public void seteName(String eName) {
			this.eName = eName;
		}
		public String geteDept() {
			return eDept;
		}
		public void seteDept(String eDept) {
			this.eDept = eDept;
		}
		public String geteGender() {
			return eGender;
		}
		public void seteGender(String eGender) {
			this.eGender = eGender;
		}
		
		// toString()
		@Override
		public String toString()
		{
			return "Employee [eAge=" + eAge + ", eName=" + eName + ", eDept=" + eDept + ", eGender=" + eGender + "]";
		}

	
	

}
