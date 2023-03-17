package Myjava;

import java.util.*;
public class Person
{
    private String firstName;
    private String lastName;
    public String address;
    private String zip;
    private String phone;
    Scanner input = new Scanner(System.in);
    public void setData()
    {
    	 System.out.println("What is your first Name?");
         firstName = input.nextLine();

         System.out.println("What is your last Name?");
         lastName = input.nextLine();

         System.out.println("What is your address?");
         address = input.nextLine();

         System.out.println("What is your zip?");
         zip = input.nextLine();

         System.out.println("What is your phone?");
         phone = input.nextLine();
    }
    public void display()
    {
        System.out.print("First Name: " + firstName +", Last Name: "+lastName +", Address: "+address +", Zip: "+zip + ", Phone: "+phone + " ");   
    }
}


