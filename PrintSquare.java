package Myjava;

import java.util.Scanner;

public class PrintSquare {
	

	    
	     public static void main(String[] args) {
	    	 PrintSquare();		
	 	}
	 	
	 	
	 	public static void PrintSquare() {
	 		Scanner scanner = new Scanner(System.in);
	 		System.out.print("Please type a number:");
	 		int num = scanner.nextInt();
	 		int square = (int) Math.pow(num, 2);
	 		System.out.println("The square of that number is " + square);
	 	}
	 }