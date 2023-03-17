package Myjava;

import java.util.Scanner;

public class Upper_lower {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter phrase to be converted : ");
String firsthalf = sc.next().toLowerCase()	;
String Secondhalf = sc.next().toUpperCase()	;
String formated_date= firsthalf+ ' '+Secondhalf; 

System.out.println( "Converted phrase : "+formated_date) ;

	
}
}
