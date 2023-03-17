package Myjava;

import java.util.Scanner;

public class Magicnumber {
public static void main(String[] args) {
	int secretNumber = (int) (Math.floor(Math.random() * 100) + 1);

	Scanner scan = new Scanner(System.in);
	System.out.println("Lets play Magic Number!");
	System.out.println("Secret Number is: "+secretNumber);
	System.out.println("Guess a number 1-100!!!");
	int n = scan.nextInt();



	while (n != secretNumber) {

	     if (n < secretNumber) {
	        System.out.println("Your guess is smaller than the secret number!");
	    } else if (n > secretNumber) {
	        System.out.println("Your guess is greater than the secret number!");
	    }
	    System.out.println("Try again");
	    n = scan.nextInt();
	}
	if (n == secretNumber) {
	    System.out.println("Your guess is correct! Congratulations!");
	}
}
}