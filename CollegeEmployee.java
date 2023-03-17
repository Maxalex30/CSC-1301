package Myjava;

import java.util.*;
public class CollegeEmployee extends Person
{   
    private String ssn;
    private double annualSalary;
    private String dept;
    Scanner input = new Scanner(System.in);
    @Override
        public void setData()
        {
            super.setData();
            String tempSalary="";
            System.out.println("What is your Social Security Number?");
            ssn = input.nextLine();

            System.out.println("What is your Annual Salary?");
            annualSalary = input.nextDouble();

            System.out.println("What is your Department name?");
            dept = input.next();        }
    @Override
        public void display()
        {
    	super.display();
        System.out.print("Social Security Number: "+ssn +", Annual Salary: "+annualSalary + ", Department Name: "+dept + " " );
        }
}


