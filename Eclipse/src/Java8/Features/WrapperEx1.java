package Java8.Features;

public class WrapperEx1 {

	public static void main(String[] args) {
		// UnBoxing
		Integer i = new Integer(9);
		int i1 = i.intValue();
		
		System.out.println(i);
		System.out.println(i1);				// Explicitly unboxing
		
		int i2 = i;							// implicitly unboxing
		System.out.println(i2);
		
		Integer i9 = 100;
		String s = i9.toString();
		System.out.println(s.length());		// length() for strings
		
		
	}

}
