package com.upskill.java;

public abstract class Class_5_AbstractClass {
		
	//Abstract class has both abstract method and regular method
	
	// Abstract Method

	public abstract void iDoor();
	
	public abstract int iWheel();
	
	public abstract String iColor();
	
	public abstract void iSeat();
	
	public abstract void iMirror();
	
	//Regular Method 
	
	public static void engine() {
		String eng= "V6";
		System.out.println("Car Engine : "+ eng);
	}

		public  void name() {
			String name = "Honda";
			System.out.println("Car Name : "+ name);
		}
		
		public int sed() {
			int sedNum = 1;
			return sedNum;
			
		}
}
