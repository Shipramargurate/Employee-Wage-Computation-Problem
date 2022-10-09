package com.bridgelabz;

import java.util.*;

public class EmployeeWage {
	/*
	 * Check Employee is Present or Absent using random
	 */
	public static void main(String[] args) {
		System.out.println("Welcomr to Employee Wage Computation Program\n");

		int IS_FULL_TIME = 1;
		Random random = new Random(); // random object
		int attendance = random.nextInt(2); // will give 0 or 1 random number

		if (attendance == IS_FULL_TIME) // condition for present or absent
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");

	}

}
