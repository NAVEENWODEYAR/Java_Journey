

// First program in the Class.,

	class First {
		
		public static  void wish(){			// static method doesn't require an object to call.,
			System.out.println("Enjoy the Journey.,");
		}
		
		public void wish1(){			//  method  requires an object to call.,
			System.out.println("Good Day.,");
		}
		
		public static void main (String [] args) {
			
			System.out.println("Exexcution starts here.,");
			wish();
			
			ob = new First();		// creating an object for calling the function wish1().,
			ob.wish1();
		}
	}