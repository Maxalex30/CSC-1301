package Myjava;

import java.util.Scanner;

public class N1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int response = scan.nextInt();
		
		while(response >1) {
		if(response % 2 == 0) {
			System.out.print(response +", ");
		 response = response / 2;}
		
		else if(response % 2 != 0) {
			System.out.print(response +", ");
			response = 3*response+1;
		}
		}
		System.out.print("1");
		
	}

}
