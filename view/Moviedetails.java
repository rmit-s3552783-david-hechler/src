package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Customer;

public class Moviedetails {

	public static void main(String[] args) {

		

		JFrame Movieframe = new JFrame("Movie Details");
		Movieframe.setSize(300, 500);

		JPanel panel = new JPanel();
		Movieframe.add(panel);
		Movieframe.setVisible(true);
	}
}
