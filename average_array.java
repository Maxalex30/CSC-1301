package Myjava;

public class average_array {
public static void main(String[]args) {
	int[]numbers = {10,20,30,40};
	
	 int sum = 0;
     for(int i=0; i < numbers.length ; i++)
      sum = sum + numbers[i];
      double average = sum / numbers.length;
      System.out.println("Average is : " + average); 
}
}
