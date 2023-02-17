package org.emp;

public class Employee {
	private void empId() {
		System.out.println("1789");
	}
//empName(), empDob(), empPhone(), empEmail(),

	private void empName() {
		System.out.println("Nithya");
	}

	private void empDob() {
		System.out.println("10-02-1988");
	}

	private void empPhone() {
		System.out.println("7600012228");
	}

	private void empEmail() {
		System.out.println("nithi@yahoo.com");
	}

	private void empAddress() {
		System.out.println("Coimbatore");
	}

	public static void main(String[] args) {

		 Employee e1= new Employee();
		 e1.empId();
		 e1.empName();
		 e1.empDob();
		 e1.empPhone();
		 e1.empEmail();
		 e1.empAddress();
	}

}
