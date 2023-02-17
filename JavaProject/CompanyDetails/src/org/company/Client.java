package org.company;

public class Client extends Company {
	public void clientName() {
		System.out.println("Harini");
	}

	public static void main(String[] args) {
		Client c= new Client();
		c.companyName();
		c.clientName();
	}

}
