package org.phone;

public class Phone {
 private void phoneInfo(String phName, String model) {
System.out.println("Phone Name: " + phName);
System.out.println("Model Name" + model);
}
 private void phoneInfo(long imei) {
System.out.println("Phone imei no: " + imei);
}
 private void phoneInfo(float phCamera) {
System.out.println("Camera pixel in Mp:" + phCamera);
}
public static void main(String[] args) {
	Phone ph = new Phone();
	ph.phoneInfo("Samsung" , " M315");
	ph.phoneInfo(865431298345234l);
	ph.phoneInfo(50.0f);
}
}
