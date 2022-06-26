package com.upskill.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Class_4_Array_Hashmap {

	public static void main(String[] args) {
		
		// Array store multiple value using index
		
		int age = 30;
		
		int[] ageYoda = new int[]{ 30, 24, 28, 32, 55, 48, 52 };
		
		// Array Index(all index start from 0,   [0] [1] [2] [3] [4] [5]
		
		System.out.println("Variable Value" + age);
		
		System.out.println("Array Value"+ ageYoda[3]);
		
		System.out.println("Array length"+ ageYoda. length);
		
		
		// Multi-dimensional Array 
		
				int[][] ageYoda2D = {
						{ 30, 24, 28, 32, 55 },// [0][0] [0][1] [0][2] [0][3] [0][4]
						{ 95, 49, 11},};//[1][0] [1][1] [1][2]
				
				System.out.println("2D Array value"+ ageYoda2D[1][1]);
				
		// Multi-dimensional Print Array
				
				for(int i=0; i<ageYoda2D.length; i++) {
					for(int j=0; j<ageYoda2D[i].length;j++){
						System.out.println(ageYoda2D[i][j]+"");
					
					}
				}
				
	System.out.println(" ");
	
										
 //Hashmap store multipul data using key-value pair, Implementation of Map interface					
	
	HashMap<String, Integer> Student = new HashMap<String, Integer>();
	
	Student.put("Aastha", 21);
	Student.put("Azad", 30);
	Student.put("Aastha", 21);
	Student.put("Kazi", 27);
	Student.put("Imtiaz", 30);
	Student.put("Rishi", 31);
	Student.put("Jafrin", 28);
	
	System.out.println("Hashmap Value, Student Age"+ Student.get("Azad"));
	
	HashMap<String, String> Capital = new HashMap<String, String>();
	
	Capital.put("Bangladesh","Dhaka");
	Capital.put("India", "Mumbai");
	Capital.put("England","London");
	Capital.put("Pakistan","Islamabad");
	
	System.out.println("HashMap Value: Capital  " + Capital.get("England"));
	
	//Hashset store unordered collection containing unique value, Implementation of Set interface
	
	HashSet<String> Car = new HashSet<String>();
	Car.add("Toyota") ;
	Car. add("BMW");
	Car.add ("Audi");

	System.out.println("Hashset Value:  " + Car);
	System.out.println("Hashset Length: " + Car.size());
	
	}

}
//HashTable store multiple date using key-value pair, but is synchronized(only one thread can be done)

				