package com.mzos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeExecuter {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee emp1 = (Employee) context.getBean("emp1");	
		System.out.println(emp1);
		
		Employee emp2 = (Employee) context.getBean("emp2");	
		System.out.println(emp2);
	}

}
