package Myjava; 
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ReadStates {

	private static JFrame myFrame = new JFrame("States in comboBox");
	private static JComboBox states;
	private static JComboBox cities;
	private static JButton addCities;

	public static void main(String[] args) {
		String[] stateslist = readFile("src/states.txt");
		states = new JComboBox();
		cities = new JComboBox();
		addCities = new JButton("Load for cities.");

		for (String state : stateslist) {
			states.addItem(state);
		}

		addCities.addActionListener(new stateListen());

		myFrame.add(states);
		myFrame.add(addCities);
		myFrame.add(cities);
		myFrame.setSize(550, 500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new FlowLayout());
		myFrame.setVisible(true);
	}

	private static String[] readFile(String filename) {
		ArrayList<String> arr = new ArrayList<>();
		try {

			FileInputStream fstream = new FileInputStream(filename);
			// create 
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

			String line;
			while ((line = br.readLine()) != null) {

				arr.add(line);
			}
			fstream.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(myFrame, "Reading failed with message " + e.getMessage());
			

		}
		return arr.toArray(new String[arr.size()]);
	}

	private static class stateListen implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String strState = (String) states.getSelectedItem();
			String[] citiesList = readFile("src/" + strState + ".txt");
			for (String city : citiesList) {
				cities.addItem(city);
			}

		}
	}
}