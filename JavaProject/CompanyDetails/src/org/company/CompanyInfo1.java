package org.company;

public class CompanyInfo1 {

	private void companyName(String name) {
		System.out.println("Company Name : " + name);
	}

	private void companyName(int cid) {
		System.out.println("Company Id:" + cid);
	}

	private void companyName(long empCount) {
		System.out.println("No of Employees: " + empCount);

	}

	public static void main(String[] args) {
			CompanyInfo1 cmp= new CompanyInfo1();
			cmp.companyName("Inmakes hub");
			cmp.companyName(24567);
			cmp.companyName(6000l);
	}

}
