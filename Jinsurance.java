package Myjava;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JInsurance extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout();
    ButtonGroup insGrp = new ButtonGroup();
    JCheckBox hmo = new JCheckBox("HMO", false);
    JCheckBox ppo = new JCheckBox("PPO", false);
    JCheckBox dental = new JCheckBox("Dental", false);
    JCheckBox vision = new JCheckBox("Vision", false);
    JTextField insChoice = new JTextField(20);
    static int HMOPRICE = 200;
    static int PPOPRICE = 600;
    static int DENTALPRICE = 75;
    static int VISIONPRICE = 20;

    String output, insChosen;
    public JInsurance() {
        super("Ex8 - Check Boxes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);

    }
    public static void main(String[] arguments) {
        JInsurance iFrame = new JInsurance();
        iFrame.setSize(400, 100);
        iFrame.setVisible(true);
    }
    @Override
    	    public void itemStateChanged(ItemEvent check) {

    	        Object source = check.getItem();

    	        int select = check.getStateChange();

    	        if (select == ItemEvent.DESELECTED) {
    	            insChoice.setText("");
    	        } else {
    	            if (source == hmo) {
    	                output = "The HMO costs $200 per month.";
    	            } else if (source == ppo) {
    	                output = "The PPO costs $600 per month.";
    	            } else if (source == dental) {
    	                output = "The Dental coverage adds $75 per month.";
    	            } else if (source == vision) {
    	                output = "The Vision care adds $20 per month.";
    	            }
    	            insChoice.setText(output);
    	        }
    	    }
    	}