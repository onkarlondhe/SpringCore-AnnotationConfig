package com.mzos;

 import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

 @Configuration
public class EmployeeConfig {

	@Bean(name = "emp1")
	
	public Employee getEmployee() {
		return new Employee(1,"Ram",50000);
	}
	
	@Bean
	
	public Address getAddress() {
		return new Address("Solapur","Maharastra",413410);
	}
	
	@Bean(name="emp2")
	
	public Employee getEmployee1() {
		
		Employee emp = new Employee();
		emp.setEmpId(2);
		emp.setEmpName("Sham");
		emp.setEmpSal(70000);
		emp.setAddress(getAddress());
		
		return emp;
	}

	 

}
