package Myjava;

import java.util.Scanner;

public class Your_Name {

		public static void main(String[] args) {
boolean repeat = true ;
while (repeat) {
	

			System.out.print("Enter your full name:");
			
			Scanner scan = new Scanner(System.in);
		
			String firstName = scan.next();
			String lastName = scan.next();
			
			int firstnamecount = firstName.length();
			int lastnamecount= lastName.length();
			char initial_1 = firstName.charAt(0);
			char initial_first = Character.toUpperCase(initial_1);
			char initial_2 = lastName.charAt(0);
			char initial_second = Character.toUpperCase(initial_2);
			char choice;
			
			System.out.println("Hello there "+firstName+" I have your first name as "+firstName+" which has "+firstnamecount+" charcters.");
			System.out.println("Hello again "+firstName+" I have your last name as "+lastName+" which has "+lastnamecount+" charcters.");
			System.out.println("Did you know that your initials are "+initial_first+"."+ initial_second+".");
			System.out.println("Do you wish to continue (Y)Yes or (N)No ?");
			choice = scan.next().charAt(0);
			
		if (choice == 'N'|| choice == 'n') {
			repeat=false  ;
		
			
		}
}
		}
}

	

