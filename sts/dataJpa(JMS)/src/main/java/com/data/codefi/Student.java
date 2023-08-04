package com.data.codefi;

import java.util.*;
import java.util.function.*;

public class Student 
{
	private int sId;
	private String sName;
	private double sMarks;
	private String sSubject;
	
		public Student()
		{
			
		}
		public Student(int sId, String sName, double sMarks, String sSubject) 
		{
		super();
		this.sId = sId;
		this.sName = sName;
		this.sMarks = sMarks;
		this.sSubject = sSubject;
		}
		public int getsId() {
			return sId;
		}
		public void setsId(int sId) {
			this.sId = sId;
		}
		public String getsName() {
			return sName;
		}
		public void setsName(String sName) {
			this.sName = sName;
		}
		public double getsMarks() {
			return sMarks;
		}
		public void setsMarks(double sMarks) {
			this.sMarks = sMarks;
		}
		public String getsSubject() {
			return sSubject;
		}
		public void setsSubject(String sSubject) {
			this.sSubject = sSubject;
		}
		 
		public static void main(String[] args)
		{
			List<Student> stList = new ArrayList<>();
			stList.add(new Student(111, "John", 81.0, "Mathematics"));
			stList.add(new Student(222, "Harsha", 79.5, "History"));
			stList.add(new Student(333, "Ruth", 87.2, "Computers"));
			stList.add(new Student(444, "Aroma", 63.2, "Mathematics"));
			stList.add(new Student(555, "Zade", 83.5, "Computers"));
			stList.add(new Student(666, "Xing", 58.5, "Geography"));
			stList.add(new Student(777, "Richards", 72.6, "Banking"));
			stList.add(new Student(888, "Sunil", 86.7, "History"));      
			stList.add(new Student(999, "Jordan", 58.6, "Finance"));       
			stList.add(new Student(101010, "Chris", 89.8, "Computers"));
			
			// Predefined Functional Interfaces.,
			// Function.,
						stList.stream().map(s-> s.getsName()).findFirst().ifPresent(System.out::println);
						System.out.println("**********Function Functional Interface*********");
						stList.stream().map(s-> s.getsName()).skip(5).limit(10).forEach(System.out::println);

		   // Predicate.,
						System.out.println("*********Predicate Functional Interface**********");
						stList.parallelStream().filter(s-> s.sMarks > 80).map(s-> s.sMarks*100/100).forEach(System.out::println);
		
		 // Consumer.,
						Consumer<Student> cs = ((Student s)->{System.out.println(s.getsMarks()+","+s.getsName());}); 
						for(Student st:stList)
						{
							System.out.println("*************");
							cs.accept(st);
						}
						
		// Supplier.,
						Supplier<Student> sp = ()-> new Student(24,"Ammu",98.9,"Economics");
						stList.add(sp.get());
						Iterator it = stList.iterator();
						while(it.hasNext())
						{
							System.out.println("***Iterator****");
							System.out.println(it.next());
						}
						
						
						System.out.println("***Iterator****");						
						for(Student st: stList)
						{
							System.out.println(st.getsName());
						}
		}
	
}
