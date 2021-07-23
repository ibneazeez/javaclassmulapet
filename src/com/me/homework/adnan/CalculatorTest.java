package com.me.homework.adnan;

public class CalculatorTest {
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator(20,0);
		try {
			System.out.println(c.div());
		} catch (Exception e) {
			System.err.println("Cannot devide zero.. please pass proper valyues..");
			e.printStackTrace();
		} 
		
		System.out.println("this line will get executed only if the exception is handled..");
	}

}
