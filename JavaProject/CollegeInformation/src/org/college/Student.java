package org.college;

public class Student extends Hostel{

	private void studentName() {
		System.out.println("Kavitha");
	}
	private void studentDept() {
		System.out.println("CSE Department");
	}
	
	private void studentId() {
		System.out.println("06CSE34");
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.hostelName();
		s.deptName();
		s.studentName();
		s.studentId();
		s.studentDept();
	}

}
