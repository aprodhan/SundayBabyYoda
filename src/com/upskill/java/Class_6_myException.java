package com.upskill.java;

public class Class_6_myException extends Exception{

	public static void main(String[] args) {
		
		}
	String str1;
	
	public Class_6_myException(String str2) {
		str1 = str2;
	}
	
	public String toStringUpskill() {
		return("This is user defined exception by Upskill" + str1);
	}

}
