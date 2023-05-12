// Variables and types in Java.,

class Variabl {
	
	static int n = 10;	// static variable.,
	
	public void add() {
		int a = 2;		// instance variable
		int b = 2;		// instance variable
		int c = a + b;	// instance variable
		
		System.out.println("Addition of " + a + " and " + b + "=" + c);
	}
	
	public static void main (String [] args) {
		char addition;		
		
		System.out.println("Variables and its types in Java");
		System.out.println(n);
		Variabl obj = new Variabl();
		obj.add();
	}
	
}