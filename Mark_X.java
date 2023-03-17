package Myjava;

import java.util.Scanner;

public class Mark_X {
public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);
	
	System.out.println("Enter a Number");
	int response = scan.nextInt();
	int firstCounter = 0;
	int secondCounter = response;
	
	
	for(int i = 0; i < response; i++) {
		for(int j = 0; j < response; j++) {
		
			if( j== firstCounter || j == secondCounter -1 ) {
				System.out.print(" * ");
			}
			else System.out.print(" . ");
		
		}
		System.out.println("");
		secondCounter--;
		firstCounter++;
	}
}
}
