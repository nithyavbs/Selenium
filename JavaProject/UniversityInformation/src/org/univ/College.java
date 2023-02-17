package org.univ;

public class College extends University {
	@Override
	public void ug(String ugName) {
		System.out.println("UG Course:" + ugName);
	}

	@Override
	public void pg(String pgName) {
		System.out.println("PG Course:" + pgName);
	}

	public static void main(String[] args) {
		College c = new College();
		c.ug("B.Tech");
		c.pg("M.Tech");
	}

}
