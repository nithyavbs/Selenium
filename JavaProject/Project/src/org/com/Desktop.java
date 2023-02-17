package org.com;

public class Desktop extends Computer {

	private void desktopSize() {
		System.out.println("14 inches");
	}
	public static void main(String[] args) {

		Desktop d= new Desktop();
		d.computerModel();
		d.desktopSize();
	}

}
