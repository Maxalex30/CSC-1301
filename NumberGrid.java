package Myjava;

import java.util.Scanner; 
public class NumberGrid {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of coloumn : ");
		int x = scan.nextInt();
		
		System.out.println("What is the row : ");
		int y = scan.nextInt(); 
		printGrid(x,y);
	}
	public static void printGrid(int x,int y) {
		int z = 1 ;
	for(int i=1 ; i<=x ; i++) {
		
	for(int j=1 ; j<=y ; j++) {
		System.out.print(z++ +" , ");
	}
	 System.out.println();
}
}
}