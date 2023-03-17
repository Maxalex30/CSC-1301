package Myjava;

import java.util.*;
public class Faculty extends CollegeEmployee
{
    private boolean isTenured = false;
    Scanner input = new Scanner(System.in);
    @Override
        public void setData()
        {
            super.setData();
            String tempTenure="";
            
            System.out.println("Do you have Tenured?");
            String tenure = input.nextLine();

            if(tenure.equals("Y") || tenure.equals("y") || tenure.equals("Yes") || tenure.equals("yes")) {
                isTenured = true;

            }
            else
                isTenured = false;        }
    @Override
        public void display()
        {
    	super.display();
        System.out.println("Tenured : " +isTenured);        }
}


