package org.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEmployee {

	public static void main(String[] args) {
		Map<Integer, Employee> emap = new HashMap<>();
		
		Employee emp1 = new Employee(101l, "Nithya", "Coimbatore", "10-07-1988", "1-11-2022", "nithi@gmail.com",
				8734512193l, 'F');
		Employee emp2 = new Employee(102l, "Jayanthi", "Namakkal", "22-06-1990", "1-10-2022", "jayathi@gmail.com",
				832166313l, 'F');
		Employee emp3 = new Employee(103l, "Karthik", "cochin", "08-05-1995", "1-02-2021", "karthi@gmail.com",
				9452312193l, 'M');
		Employee emp4 = new Employee(104l, "Haritha", "Salem", "27-12-1991", "1-04-2022", "haritha@gmail.com",
				6892361863l, 'F');
		Employee emp5 = new Employee(105l, "Dinesh", "Madurai", "18-03-1998", "1-01-2022", "dinesh@gmail.com",
				9734512123l, 'M');
		Employee emp6 = new Employee(106l, "Senthil", "COimbatore", "10-07-1988", "1-11-2022", "senthil@gmail.com",
				872351393l, 'M');
		Employee emp7 = new Employee(107l, "Janani", "Chennai", "30-08-1992", "1-06-2022", "janani@gmail.com",
				8734512193l, 'F');
		Employee emp8 = new Employee(108l, "Rajesh", "Trichy", "10-01-1989", "1-03-2022", "raj@gmail.com", 8798475212l,
				'M');
		Employee emp9 = new Employee(109l, "Kumar", "Karur", "25-07-1994", "1-07-2022", "kumar@gmail.com", 9865318293l,
				'M');
		Employee emp10 = new Employee(110l, "Vijay", "Erode", "29-11-1991", "1-09-2022", "viji@gmail.com", 7892642393l,
				'M');

		emap.put(1, emp1);
		emap.put(2, emp2);
		emap.put(3, emp3);
		emap.put(4, emp4);
		emap.put(5, emp5);
		emap.put(6, emp6);
		emap.put(7, emp7);
		emap.put(8, emp8);
		emap.put(9, emp9);
		emap.put(10, emp10);

		for (Map.Entry<Integer, Employee> entry : emap.entrySet()) {
			int key = entry.getKey();
			Employee e = entry.getValue();
			System.out.println(key + " Employee:");
			System.out.println(e.getEmpId() + " " + e.getName() + " " + e.getAddress() + " " + e.getDob() + " "
					+ e.getDoj() + " " + e.getEmail() + " " + e.getPhone() + " " + e.getGender());

		}
	}

}
