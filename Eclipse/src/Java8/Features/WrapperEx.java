package Java8.Features;

public class WrapperEx {

	public static void main(String[] args) {
		// Wrapper classes for autoboxing and unboxing
			int a = 5;
			Integer b = 5;					// /autoboxing, now compiler will write Integer.valueOf(a) internally  
	
			System.out.println(a);
			System.out.println(b);
			System.out.println(a==b);
			
		
			
			int t = 10;
			Integer u =Integer.valueOf(t);  // converting into integer explicitly
			System.out.println(t==u);
			
	}

}
