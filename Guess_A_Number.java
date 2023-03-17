package Myjava;

import java.util.Scanner;

public class Guess_A_Number {
public static void main(String[] args) {    

Boolean playAgain = true;

        while(playAgain == true) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Guess The secret number " +
                "\n----------------------");
        System.out.print("Enter maximum value for secret number: ");
        int maxNumber = scan.nextInt();


            int secretNumber = (int) (Math.random() * maxNumber) + 1;
            System.out.println("A new secret number has been chosen");

            System.out.print("Enter guess: ");
            int guess = scan.nextInt();
            int attempts = 1;


            while (guess != secretNumber) {
                if (guess < secretNumber) {
                    System.out.print("Too low; try again: ");
                    guess = scan.nextInt();
                    attempts++;
                } else if (guess > secretNumber) {
                    System.out.print("Too high; try again: ");
                    guess = scan.nextInt();
                    attempts++;
                }

            }

            if (guess == secretNumber) {
                System.out.println("You won in " + attempts + " guesses!");

            }

            System.out.println("Play again? (1 for yes/2 for no): ");
            int response = scan.nextInt();
            System.out.println(response);



            if ( response != 1) {
                playAgain = false;
               
            }
        }
}
}