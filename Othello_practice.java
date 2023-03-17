package Myjava;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.*;
import java.util.Scanner; 
public class Othello_practice {
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner (System.in) ;
    	 System.out.println("-------------------\n  Welcome to Go! \n-------------------");
        System.out.print( "Player # 1,  what is your First name and Last name:");
        String Player1_firstName = scan.toString() ; 
        System.out.println( "... so yourname is "+ Player1_firstName);  
        System.out.println("\n Player # 2 , what is your First name and  Last name:");
        String Player2_firstName = scan.toString() ; 
        System.out.println( "... so yourname is " + Player2_firstName);  
        class Person{
      public String Player1_firstName;
      public String Player2_firstName;
        			
      public String getPlayer1_FirstName() {
    	  return Player1_firstName ; 
    	  
      }
        	public void setFirstName (String Player1_firstName) {
        		this.Player1_firstName=Player1_firstName;
        	}
        	 public String getPlayer2_FirstName() {
           	  return Player2_firstName ; 
           	  
             }
               	public void set2ndFirstName (String Player2_firstName) {
               		this.Player2_firstName=Player2_firstName;
               	
        }
               	
               abstract class practice2 {
                    public void main(String args[]) { // need static
                    	JButton button1= new JButton ("Player_1");
                  		JButton button2= new JButton("Player_2"); 
                  		JButton button3 = new JButton ( "CPU");
                        //Creating the Frame
                        JFrame frame = new JFrame("Chat Frame");
                        
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(550, 500);
                        System.out.println("-------------------\n   Welcome to Go! \n-------------------");

                        //Creating the MenuBar and adding components
                    	
                        JMenuBar mb = new JMenuBar();
                        JMenu m1 = new JMenu("FILE");
                        JMenu m2 = new JMenu("Help");
                        mb.add(m1);
                        mb.add(m2);
                        JMenuItem m11 = new JMenuItem("Open");
                        JMenuItem m22 = new JMenuItem("Save");
                        JMenuItem m33 = new JMenuItem("save as"); 
                        m1.add(m11);
                        m1.add(m22);
                        m2.add(m33);

                        //Creating the panel at bottom and adding components
                        JPanel panel = new JPanel(); // the panel is not visible in output
                        JLabel label = new JLabel("Enter Text");
                        JTextField tf = new JTextField(30); // accepts up to 10 characters
                        JButton send = new JButton("Send");
                        JButton reset = new JButton("Reset");
                        panel.add(label); // Components Added using Flow Layout
                        panel.add(tf);
                        panel.add(send);
                        panel.add(reset);

                        // Text Area at the Center
                        JTextArea ta = new JTextArea();

                        //Adding Components to the frame.
                        frame.getContentPane().add(BorderLayout.SOUTH, panel);
                        frame.getContentPane().add(BorderLayout.NORTH, mb);
                        frame.getContentPane().add(BorderLayout.CENTER, ta);
                        frame.getContentPane().add(button1);
                        frame.getContentPane().add(button2);
                        frame.getContentPane().add(button3);
                        frame.setVisible(true);
                    }
                }
    	
      public  void Black_piece(String[] args) {
    	  
    // all black piece gui, including loops and (prediction?),no can be optimized outside) goes here
    	//a dark grey i.e #212427  
    	  
    	  
    	  
      }
      public void White_piece(String[] args) {
    	  
    	  
      }
  		public void grid ( String [] args) {
  			
  			System.out.println (" Choose your grid size:  "); 
  			// for loop  
  			
  			
  		}
  	
      
      
}
    }
}