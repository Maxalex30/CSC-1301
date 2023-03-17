package Myjava;

import java.util.Scanner;

public class Convert_Date {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in); 

	System.out.println("Enter date to be converted : ");
String Usermonth = sc.next().toLowerCase()	;
String CapitalUsermonth = Usermonth.substring(0,1).toUpperCase() + Usermonth.substring(1);
String Userday = sc.next().replaceAll(",", "")	;
String Useryear = sc.next()	;
String formated_date= Userday+ ' '+CapitalUsermonth+' '+Useryear ; 
	System.out.println( "Converted date : "+formated_date) ;
	//apRiL	28,	2003
		

}
}