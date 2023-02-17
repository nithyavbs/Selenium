package org.collection;

public class Employee {
private long empId;
private String name, address, dob, doj, email;
private long phone;
private char gender;
public long getEmpId() {
	return empId;
}
public void setEmpId(long empId) {
	this.empId = empId;
}
public Employee(long empId, String name, String address, String dob, String doj, String email, long phone, char gender) {
	this.empId = empId;
	this.name = name;
	this.address = address;
	this.dob = dob;
	this.doj = doj;
	this.email = email;
	this.phone = phone;
	this.gender = gender;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", dob=" + dob + ", doj=" + doj
			+ ", email=" + email + ", phone=" + phone + ", gender=" + gender + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getDoj() {
	return doj;
}
public void setDoj(String doj) {
	this.doj = doj;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}

}
