package org.pc;

public class Desktop implements Software {

	@Override
	public void hardwareResources() {
		System.out.println("Hardware Resources: CPU, RAM, ROM");
	}
	
	@Override
	public void softwareResources() {
		System.out.println("Software Resources: OS, MS Office, Browsers");
	}
	public static void main(String[] args) {

		Desktop d= new Desktop();
		d.hardwareResources();
		d.softwareResources();
	}

}
