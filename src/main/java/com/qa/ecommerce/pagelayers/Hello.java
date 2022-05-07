package com.qa.ecommerce.pagelayers;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operation;
		int result;
		Scanner sc = new Scanner(System.in);
		//ask user to enter operation
		System.out.println("choose an operator : +,-,* and /");
		operation = sc.next().charAt(0);
		
		System.out.println("Enter the first number : ");
		int first = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		int second = sc.nextInt();
		
		switch(operation)
		{
		case '+':
			result = first + second;
			System.out.println(first + " + " + second + " = " + result);
			break;
			
		case '-':
			result = first - second;
			System.out.println(first + " - " + second + " = " + result);
			break;
		
		case '*':
			result = first * second;
			System.out.println(first + " * " + second + " = " + result);
			break;
		
		case '/':
			result = first / second;
			System.out.println(first + " / " + second + " = " + result);
			break;
			
		}
		sc.close();
		
		
		
		


		

	}

}
