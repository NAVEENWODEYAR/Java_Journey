package com.dataJpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dataJpa.madal.Student;
import com.dataJpa.repo.StudentRepo;

@SpringBootApplication
public class DataJpaApplication 
{

	public static void main(String[] args) 
	{
		System.out.println("Spring started.,");
		SpringApplication.run(DataJpaApplication.class,args);
//		
//		ApplicationContext context= SpringApplication.run(DataJpaApplication.class, args);
//		StudentRepo sp = context.getBean(StudentRepo.class);
//		Student st = new Student();
//				st.setId(100);
//				st.setName("Bhaskar");
//				st.setAddress("Kolar");
//				
//		Student st1 = new Student();
//				st1.setId(102);
//				st1.setName("Monu");
//				st1.setAddress("Bangarpet");
//		Student st2 = new Student();
//				st2.setId(104);
//				st2.setName("Murali");
//				st2.setAddress("Budikote");
//		
//			// creating the list	
//			List<Student> lt = List.of(st1,st,st2);
//			
//			// Iterator
//			Iterable<Student> it = sp.saveAll(lt);
//			
//			// forEach
//			it.forEach(t ->{System.out.println(t);});
//		System.out.println("Table created.,");
		
	}

}
