package com.bridgelabz;

import java.util.*;

public class EmployeeWage {
	/*
	 * Calculate Daily Employee Wage assuming wage per hour is 20 and full day hour is 8
	 */
	public static void main(String[] args) {
		System.out.println("Welcomr to Employee Wage Computation Program\n");

		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		int empHour = 0;
		int empWage = 0;
		Random random = new Random(); // random object
		int attendance = random.nextInt(2); // will give 0 or 1 random number

		if (attendance == IS_FULL_TIME)
			empHour = 8;
		else
			empHour = 0;
		empWage = empHour * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage : " + empWage);
	}

}
