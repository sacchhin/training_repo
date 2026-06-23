package com.oops.bean1;

public class EmpName {

	public static void main(String[] args) {

		Employee employee =  new Employee();
		
		employee.setEmpname("Navin");
		employee.setEmpid(1);
		employee.setSalary(3000.4);
		employee.setMarried(false);
		
		System.out.println(employee.getEmpname());
		System.out.println(employee.getEmpid());
		System.out.println(employee.getSalary());
		
		
		System.out.println(employee);
		

	}

}
