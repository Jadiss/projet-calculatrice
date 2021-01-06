package com.calculatrice.me;

import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//op.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------CALCULATRICE------------------");
		System.out.print(">");
		float input1=sc.nextFloat();
		System.out.print(">");
		float input2=sc.nextFloat();
		System.out.print(">");
		String operation = sc.next();
		sc.close();
		
		switch(operation){
			case "+":
				System.out.println(Operation_plus.operationPlus(input1, input2));
				break;
			case "-":
				System.out.println(Operation_moins.operationMoins(input1, input2));
				break;
			case "*":
				System.out.println(Operation_multiplication.operationMultiplication(input1, input2));
				break;
			case "%":
				System.out.println(Operation_division.getResteFrom(input1, input2));
				break;
			case "/":
				System.out.println(Operation_division.getQuotientFrom(input1, input2));
				break;
		}
		//instruction pour while
	}
}
