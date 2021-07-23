package com.me.homework.adnan;

public class ExceptionsHome {
	
	public static void main(String[] args) {
		
		System.out.println("Temp");
		try {
			testAge(190);
		} catch (AgeBoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void testAge(int age) throws AgeBoundException {
		
		if(age <0 && age > 150) {
			throw new AgeBoundException();
		}
	}

}
