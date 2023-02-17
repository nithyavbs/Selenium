package org.emp;

public class Employee1 {

	private void empId(int eid) {
		System.out.println("Employee id :" + eid);
	}
	
	private void empId(String name) {
		System.out.println("Employee name: " + name);
	}
	
	private void empId(float salary) {
		System.out.println("Employee salary:" + salary);
	}
	public static void main(String[] args) {
		
		Employee1 emp= new Employee1();
		emp.empId(123);
		emp.empId("Nithya");
		emp.empId(24000f);
	}

}
