package com.bridgelabz;

import java.util.*;

public class EmployeeWage {
	/*
	 * solving using switch case
	 */
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program\n");

		int empHour = 0;
		int empWage = 0;
		Random random = new Random(); // random object
		int attendance = random.nextInt(3); // 0,1,2
		switch (attendance) {
		case IS_PART_TIME:
			empHour = 4;
			break;
		case IS_FULL_TIME:
			empHour = 8;
			break;
		default:
			empHour = 0;
		}
		empWage = empHour * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage : " + empWage);
	}
	}

