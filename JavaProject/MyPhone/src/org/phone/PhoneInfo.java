package org.phone;

public class PhoneInfo {

	private void phoneName() {
		System.out.println("Samsung M315G");
	}

	private void phoneImeiNum() {
		System.out.println("865431298345234");
	}

	private void Camera() {
		System.out.println("Rear 50.0 MP + 2.0 MP");
	}

	private void Storage() {
		System.out.println("6GB RAM, 128GB ROM");
	}

	private void osName() {
		System.out.println("Andriod 10");
	}

	public static void main(String[] args) {
		PhoneInfo mob= new PhoneInfo();
		mob.phoneName();
		mob.phoneImeiNum();
		mob.osName();
		mob.Storage();
		mob.Camera();
	}

}
