// Operators in Java.,

class Operator {
		
		
	public static void primitive_Type(){
		
		boolean bl = true;				// Boolean stores only two values., true and false..
		System.out.println(bl);
		
		
		byte by = 100;					// An 8 bit signed two's complement and the value range is -127 to 127., It can be also used in place of int.,
		System.out.println(by);
		
		short sh = 30000;				// 16 bit two's complement integer and the value range is -32,678 t0 32,678., It is two times smaller than an integer.,
		System.out.println(sh);
		
		int i = 200000;					// 32 bit two's complement integer and the value range is -2,147,483,648 to 2,147,483,648.,
		System.out.println(i);
		
		long l = 10000L;				// 64 bit two's complement integer.
		System.out.println(l);
		
		float fl = 3.14f;				// A single precession 32 bit floating point.
		System.out.println(fl);
		
		double db = 45.5;				// Double precession 64 bit floating point., Value range is unlimited.,
		System.out.println(db);
		
		char c = 'c';					// Single 16 bit unicode character.,
		System.out.println(c);
	}
	
	
	public static void operatr(){
		
		System.out.println("Operators in Java.,");
		
		int a = 4;
		short b = 10;
		
		//System.out.println(a++);		// Unary operator require only one operand.,
		//System.out.println(++a);
		System.out.println(~a);
		
		//System.out.println(b--);
		System.out.println(--b);
		
		System.out.println("Arithmetic Operators");
		System.out.println(a + b);
		System.out.println(a / a);
		
		
	}
	

	public static void main (String [] args){
		
		System.out.println("Data Types in Java.,");
		//primitive_Type();
		operatr();
	}
}