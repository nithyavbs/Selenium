package org.collection;

public class Student {
	
	private long stdId;
	private String stdName, address, dob,email;
	private long phone;
	private char gender;
	public Student(long stdId, String stdName, String address, String dob, String email, long phone, char gender) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.address = address;
		this.dob = dob;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", address=" + address + ", dob=" + dob + ", email="
				+ email + ", phone=" + phone + ", gender=" + gender + "]";
	}

	public long getStdId() {
		return stdId;
	}
	public void setStdId(long stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
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
