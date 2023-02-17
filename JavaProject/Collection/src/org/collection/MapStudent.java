package org.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapStudent {

	public static void main(String[] args) {

		Map<Integer, Student> sm = new TreeMap<>();

		Student std1 = new Student(101l, "Nithya", "Coimbatore", "10-07-1988", "nithi@gmail.com", 8734512193l, 'F');
		Student std2 = new Student(102l, "Jayanthi", "Namakkal", "22-06-1990", "jayathi@gmail.com", 832166313l, 'F');
		Student std3 = new Student(103l, "Karthik", "cochin", "08-05-1995", "karthi@gmail.com",	9452312193l, 'M');
		Student std4 = new Student(104l, "Haritha", "Salem", "27-12-1991","haritha@gmail.com",6892361863l, 'F');
		Student std5 = new Student(105l, "Dinesh", "Madurai", "18-03-1998", "dinesh@gmail.com",
				9734512123l, 'M');
		Student std6 = new Student(106l, "Senthil", "COimbatore", "10-07-1988","senthil@gmail.com",872351393l, 'M');
				
	   Student std7 = new Student(107l, "Janani", "Chennai", "30-08-1992","janani@gmail.com",8734512193l, 'F');
	 Student std8 = new Student(108l, "Rajesh", "Trichy", "10-01-1989", "raj@gmail.com",8798475212l,'M');
	Student std9 = new Student(109l, "Kumar", "Karur", "25-07-1994"," kumar@gmail.com", 9865318293l,'M');
	Student std10 = new Student(110l, "Vijay", "Erode", "29-11-1991", "viji@gmail.com", 7892642393l,
			'M');
	 sm.put(1, std1);
	 sm.put(2, std2);
	 sm.put(3, std3);
	 sm.put(4, std4);
	 sm.put(5, std5);
	 sm.put(6, std6);
	 sm.put(7, std7);
	 sm.put(8, std8);
	sm.put(9, std9);
 sm.put(10, std10);
 
 for (Map.Entry<Integer, Student> entry : sm.entrySet()) {
	 int key = entry.getKey();
		Student s = entry.getValue();
		System.out.println(key + " Student:");
		System.out.println(s.getStdId() + " " + s.getStdName() + " " + s.getAddress() + " " + s.getDob() + " "
				+  " " + s.getEmail() + " " + s.getPhone() + " " + s.getGender());
}
}}
