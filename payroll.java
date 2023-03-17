package Myjava;

import java.util.Scanner; 

public class payroll {
	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.println("Please print out: ");
	System.out.println("Employee name: "); 
	String name = console.nextLine();
	System.out.println("Number of Hours worked: " );  
	int hours = console.nextInt();
	System.out.println("Hourly rate of Pay: "); 	
	double hourly_rate = console.nextDouble();
	System.out.println("Federal Tax Rate: "); 
	double federal_tax_rate = console.nextDouble();
	
	double gross_pay= hours*hourly_rate ; 
	double net_pay = gross_pay- federal_tax_rate ;		
	
	System.out.print(
			"Employee name: " + name + 
			"\nHours Worked: "+ hours + " hours " +
			"\nHourly Rate: $"+ hourly_rate +
			"\nGross Pay: $"+ gross_pay +
			"\nTax Deducted: $"+ federal_tax_rate+
			"\nNet Pay: $"+ net_pay );
	
	
}
	
}
// needs to include an escape indent