package com.Internshala.StudentId.IncomeTax;

import java.util.Scanner;

public class incomeTax {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" Tax Calculator App ");
		System.out.println("------WELCOME------");
		
		System.out.println("Enter total person count: ");
		int personCount = in.nextInt();
		
		String names[] = new String[personCount];
		long incomes[] = new long[personCount];
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("Enter Name "+(i+1)+" :");
			names[i] = in.next();
			System.out.println("Enter "+names[i]+"'s Annual Income:");
			incomes[i] = in.nextLong();
		}
		
		System.out.println("Names with liable taxes");
		System.out.println("-----------------------");
		for(int i = 0; i < names.length; i++) {
			calculateTax(names[i],incomes[i]);
		}	
	}
	public static void calculateTax(String name, long income) {
		long tax;
		
		if(income >= 300000) {
			tax = income * 20/100;
			System.out.print(name+":"+"₹ "+tax);
			System.out.println();
			
		}else if(income >= 100000 && income <= 300000) {
			tax = income * 10/100;
			System.out.print(name+":"+"₹ "+tax);
			System.out.println();
		}else {
			tax = income * 0/100;
			System.out.print(name+":"+"₹ "+tax);
			System.out.println();
		}
		
	}
	
}
