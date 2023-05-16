package Boss.Home.Expense;
	
	interface exp
	{
		void add();
	}
	public class Expenses implements exp
	{	
		private double rent, food;
		
				public double getRent() {
					return rent;
				}
	
				public void setRent(double rent) {
					this.rent = rent;
				}

				public double getFood() {
					return food;
				}

				public void setFood(double food) {
					this.food = food;
				}


				public void add()
				{
					double ttlExp = 0;
							ttlExp = rent + food;
							System.out.println("Total Expenditure: "+ttlExp);
				}
		
	
		public static void main(String[] args) {
				
			Expenses ob = new Expenses();
					ob.setRent(6000.00);
					ob.setFood(3000);
					
					double d = ob.getFood();
					double ds = ob.getRent();
					
					System.out.println("Rent: "+d);
					System.out.println("Food: "+ds);
					
					ob.add();
					
		}	
	}
