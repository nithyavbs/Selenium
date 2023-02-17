package org.company;

public class CompanyInfo {

	// companyName(), companyId(), companyAddress()
	private void companyName() {
		System.out.println("Inmakes Learning Hub");
	}

	private void companyId() {
		System.out.println("1234");
	}

	private void companyAddress() {
		System.out.println("Chennai");

	}

	public static void main(String[] args) {
			CompanyInfo cmp= new CompanyInfo();
			cmp.companyName();
			cmp.companyId();
			cmp.companyAddress();
	}

}
