package Myjava;

import java.util.Scanner; 

public class Rolling_Dice {
		
		public static void main(String[] args) {
		
			int roll1 = Rolling_Dice();
			int roll2 = Rolling_Dice();
			
			int rollSum = roll1 + roll2;
			
			System.out.println("The value of the first die is " + roll1);
			System.out.println("The value of the second die is " + roll2);
			System.out.println("Your total roll is " + rollSum);
			
			if (rollSum > 6) {
				System.out.println("The total roll is greater than 6");
			}		
		}
		
		
		public static int Rolling_Dice() {
			int min = 1;
			int max = 6;
			return (int) (Math.random() * (max - min + 1) + min);
		}
		
	}
