package com.upskill.java;

public class Class_2_Loops {
	
	/* Type of Loop
	 1.For Loop
	 2.While Loop
	 3.Do While Loop
	 4.Infinite Loop
	 */


	public static void main(String[] args) {
		//System.out.println(1);
		//System.out.println(2);
		//System.out.println(3);
		//System.out.println(4);
		
		practiceForLoop();
		//practiceWhileLoop();
		//practiceDoWhile();
		//practiceInfiniteLoop();
		//practiceNestedLoop();
		
		multipicationTable();
	}
	
	public static void practiceForLoop() {    //For Loop- Do again and again upto upper limit
		int i;                               //Initialize Variables
		for(i=1; i<10; i++) {                // Setting Lower limit, Upper limit, Increment or decrement
			
			System.out.println("For Loops Numbers ="+ i);
			
		}
	}
	
	public static void practiceWhileLoop() {  //While Loop- Do again and upto condition match
		int i= 1;                             //Initialize variables
		while(i<1000) {                        //Setting condition
			System.out.println("While Loops Numbers ="+ i);  //Statement
			i++;                                           //Increment or decrement
			
		}
	}
	public static void practiceDoWhile() {   //Do While Loop- Do action then match condition
		int i = 1;                           //Initialize variables
		do {                                 
			System.out.println("While Loops Numbers =" +i );//statement
		i++;                                                //Increment 
		}while (i <=1000);                               // checking condition
	}
	
	public static void practiceInfiniteLoop() {
		int i;                 //Initialize variables 
		for(i=1; ; i++) {      //Setting No Upper linit
			System.out.println("For Loops Numbers=" +i);  // Statement 
		}
	}
	
	public static void practiceNestedLoop() {  //Nested Loop= loop inside another loop
		int i;                   				//Initializing variable i
		int j;									//Initializing variable j
		for (i=1; i<10; i++) {					//First loop for i 
		for (j=1; j<10; j++) {					//Second loop for j
			System.out.println("Nested For Loops Numbers="+i+":"+j); //Statement for j loop
		}
		System.out.println("Increase value of i ->"+i); // Statement for i loop 
		}
	}
	
public static void multipicationTable() {
		
		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= 10; col++) {
				int MultiplicationTable = row * col;
				System.out.print(MultiplicationTable + " ");
			}
			System.out.println("");
		}
	}
}


