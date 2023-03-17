package Myjava;

import java.util.Scanner;

public class simple_binary_converter {
	public static void main (String[]args) {
		

	
		Scanner s = new Scanner(System.in);

		int value ;
		String toConvert;

		System.out.print("\nEnter any value: ");
		value = s.nextInt();

		System.out.print("\nFor converting to (Binary), press 'ToBinary' & for (Decimal), press 'ToDecimal': ");
		toConvert = s.next();


		if(toConvert.equals("ToDecimal")){

		if(value <= 111){

		int[] decToBin = new int[3];

		int decimal=0 , base =1;

		for (int i=0; i<3; i++){

		decToBin[i] = value % 10;

		decimal += (decToBin[i] * base); //Initially base is 1 means 2^0 = 1, next it will be 2,4,8,16...


		base = base * 2;

		value = value / 10;
		}
		System.out.println("\nIn decimal, that value is "+decimal);
		}
		else{


		System.out.println("\nOut of range");
		}
		}

		else if(toConvert.equals("ToBinary")){


		if(value >= 0 && value <= 7){

		int[] binaryNo = new int[3];


		for (int i=0; value > 0; i++){

		binaryNo[i] = (value % 2) ;

		value /= 2;
		}

		System.out.println("\nIn Binary, that value is ");

		for (int i=2; i>=0; i--){
		System.out.print(binaryNo[i]);
		}
		}
		else{

		System.out.println("\nOut of range");
		}
		}

		else{
		System.out.println("Invalid number system for conversion");
		}
		}
		
	


	}
