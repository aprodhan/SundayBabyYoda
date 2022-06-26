package com.upskill.assignment1;

public class Assignment_1_3 {
	// A function which returns the multiply value of a and b where a = 9 and b = 11.      
	 //Write a program which will display addition of a +b + function returns value.
	 

	public static void main(String[] args) {
		System.out.println("Function A Return :: =" + multiplyValue() );
		additionValue();
	}
public static int multiplyValue() {
	int a= 9;
	int b= 11;
	
	int returnValue = a*b;
	return returnValue;
}
public static void additionValue() {
	int a= 9;
	int b= 11;
	int c= 99;
	
	int displayValue = a+b+c;
	
	System.out.println("ReturnValue= "+ displayValue );
	
			
}
}
