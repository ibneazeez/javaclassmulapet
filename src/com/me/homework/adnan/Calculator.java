package com.me.homework.adnan;

public class Calculator {

	
	private int a;
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


	private int b;
	
	int sum() {
		return this.a+this.b;
	}
	
	int sub() {
		return this.a-this.b;
	}
	
	
	int div() throws CannotDevidZeroException {
		
		if(this.b==0) throw new CannotDevidZeroException();
		
		return this.a/this.b;
	}
	
}
