package com.bridgelabz;

public class EmployeeWageMain {

	public static void main(String[] args) {
		Welcome();
		EmployeeWage employeewage = new EmployeeWage();
		System.out.println("------------------------");
		System.out.println("bridglabz company");
		System.out.println("------------------------");
		employeewage.wage("bridegalz ", 20, 18, 80);
	
		System.out.println("------------------------");
		System.out.println(" Reliance company");
		System.out.println("------------------------");
		employeewage.wage("Reliance", 30, 22, 120);
	
		System.out.println("------------------------");
		System.out.println(" max company");
		System.out.println("------------------------");
		employeewage.wage("Max", 40, 25, 130);

		
	}

	static void Welcome() {
		System.out.println("Welcome to Employee Wage Computation Program\n");

	}

}
