package Myjava;
import java.util.Scanner;
public class TimesAndInstructors {
	    public static void main(String[] args) {

	        Scanner scan =new Scanner(System.in);
	        boolean exists = false;
	        boolean CourseName = true;
	        String courses[][] = { {"CIS101", "Mon 10am", "Mike Rotch" },
	                               {"CIS102", "Tues 11am", "Juanna Smoke"},
	                               {"CIS103", "Wed 12pm", "Seymore Buddz"},
	                               {"CIS104", "Thurs 1pm", "Innetta P."},
	                               {"CIS105", "Friday 2pm", "Richard Long"}};

	        System.out.println("Enter Only a Course Name :");
	        String userCourseName = scan.nextLine();
	        while(userCourseName.equals(courses[0][1]) || userCourseName.equals(courses[0][2]) || userCourseName.equals(courses[1][1]) || userCourseName.equals(courses[1][2])|| userCourseName.equals(courses[2][1])|| userCourseName.equals(courses[2][2])
	                || userCourseName.equals(courses[3][1])|| userCourseName.equals(courses[3][2]) || userCourseName.equals(courses[4][1])|| userCourseName.equals(courses[4][2])){
	            System.out.println("Enter A Valid Course Name :");
	             userCourseName = scan.nextLine();
	        }


	        for(int i = 0; i < courses.length; i++){
	            if(userCourseName.equals(courses[i][0])){
	                System.out.println("Course: " + courses[i][0] + " Time: " + courses[i][1] + " Instructor: " + courses[i][2]);
	                exists = true;
	            }
	        }
}
}