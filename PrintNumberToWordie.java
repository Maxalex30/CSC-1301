package Myjava;

import java.util.Scanner;

public class PrintNumberToWordie {
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	System.out.println("Gimme your input, Daddy");
	int n = scan.nextInt();
	if (n== 1 ) {  
		System.out.println("One");  
    } else if (n==2 ) {  
			System.out.println("Two");
    } else if (n==3 ) {  
		System.out.println("three");
    } else if (n==4 ) {  
		System.out.println("four");
    } else if (n==5 ) {  
		System.out.println("five");
    } else if (n==6 ) {  
		System.out.println("six");
    } else if (n==7 ) {  
		System.out.println("Seven");
    } else if (n==8 ) {  
		System.out.println("eight");
    } else if (n==9 ) {  
		System.out.println("nine");
    } else if (n==10 ) {  
		System.out.println("Ten");
    }if ( n*1%2==0 )	{
			System.out.println("the input is divisible by two");
 	}else {
		System.out.println("the input is NOT divisible by two");
	}
}
}