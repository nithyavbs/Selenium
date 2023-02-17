package org.bank;

public class AxisBank extends BankInfo{
 @Override
	public void deposit(int fd) {
	 System.out.println("Deposited Amount:" + fd);
	}
 
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit(25000);
	}

}
