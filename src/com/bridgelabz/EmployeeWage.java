package com.bridgelabz;

import java.util.*;

public class EmployeeWage {
	/*
	 * Add Part time Employee & Wage by assuming part time hours is 8
	 */
	public static void main(String[] args) {
		System.out.println("Welcomr to Employee Wage Computation Program\n");

		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHour = 0;
		int empWage = 0;
		Random random = new Random(); // random object
		int attendance = random.nextInt(3); // 0.1,2

		if (attendance == IS_FULL_TIME)
			empHour = 8;
		else if(attendance == IS_PART_TIME) 
			empHour = 4;
		else
			empHour = 0;
		empWage = empHour * EMP_RATE_PER_HOUR;
		
		System.out.println("Emp Wage : " + empWage);

	}

}
