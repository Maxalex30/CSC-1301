package Myjava;


import java.util.Scanner; 

public class GradeReport {
    
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Gradebook:");
			int grade = scanner.nextInt();
			GradeReport(grade);
		}
		
		
		public static void GradeReport(int grade) {
			if (!(0 <= grade && grade <= 100)) {
				System.out.println("Error: You must enter an integer between 0 and 100");
				return;
			}
			
			int category = grade / 10;
			
			switch (category) {
	            case 0:
	            case 1:
	            case 2:
	            case 3:
	            case 4:
	            case 5:           
	            case 6:
	                  System.out.println("below average you should see the professor...to clarify the material presented in class...");
	                  break;
	            case 7:
	                  System.out.println("average");
	                  break;
	            case 8:
	                  System.out.println("Nice job");
	                  break;
	            case 9:
	                  System.out.println("well above average.Excellent");
	                  break;
	            case 10:
	                  System.out.println("Perfect score job well");
	                  break;
	            default:
	            	System.out.println("Invalid category: " + category);
			}
		}
	}
		

	


