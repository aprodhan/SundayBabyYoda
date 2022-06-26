package com.upskill.java;

public class Class_1_MethodType_Object {
	
	//Test
	
	static int hourlyIncome = 65; //Manual QA = 40-55$, Automation QA = 50-70$, SDET = 60-80$

	public static void main(String[] args) {
		
		//Static Method
		weeklyIncomeVoid();
		
		
		System.out.println("Monthly Income :::"+ monthlyIncomeReturn2());
		
		//Void non-static Method - have to create class object and call it 
		Class_1_MethodType_Object myobj = new Class_1_MethodType_Object();
		
		//Class name 			Object name = new class name ()
		myobj.annualIncomeVoid();
		
		int monthly = myobj.monthlyIncomeReturn();
		System.out.println("Monthly Income ::: " + monthly);
		System.out.println("Job Title :::"+ jobTitle());

	}
	
/* 	Types of Methods
  	1.Void Method- empty method you can write any statement
   	2.Static Method - don't have to create object to call 
   	3.Return Type Method - must have to return any data 
   	  */
	
	
	//Void non-static Method
	public void annualIncomeVoid(){
		int annual = hourlyIncome * 2000;
		System.out.println("Annual Income ::: " + annual);
	}
	
	//Static Method
	public static void weeklyIncomeVoid(){
		int weekly = hourlyIncome * 40;
		System.out.println("Weekly Income ::: " + weekly);
	}

	//Return Type Method - non-static  
	public  int monthlyIncomeReturn(){
		int monthly = hourlyIncome * 180;
		return monthly;
		
		
	}
	//Return Type Method - static 
		public static int monthlyIncomeReturn2() {
			int monthly = hourlyIncome * 180;
			return monthly;
		}
		
		public static String jobTitle() {
			String title = "QA Automation Engineer";
			return title;
			
		}
		
}

