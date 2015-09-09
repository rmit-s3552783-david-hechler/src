package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RegistrationForm {
	public static String cid, cname, caddr, cemail, ctelno;

	public static void init() {
		JFrame Loginframe = new JFrame("Registration Page");
		Loginframe.setSize(300, 500);

		JPanel panel = new JPanel();
		Loginframe.add(panel);
		insertComponents(Loginframe);

		Loginframe.setVisible(true);
	}

	static void insertComponents(final JFrame Loginframe) {

		Loginframe.setLayout(null);

		JLabel customerIDLabel = new JLabel("Customer ID");
		customerIDLabel.setBounds(10, 10, 100, 25);
		Loginframe.add(customerIDLabel);

		JTextField customerIDText = new JTextField();
		customerIDText.setBounds(100, 10, 160, 25);
		Loginframe.add(customerIDText);
		cid = customerIDText.getText();

		JLabel customernameLabel = new JLabel("Name");
		customernameLabel.setBounds(10, 40, 100, 25);
		Loginframe.add(customernameLabel);

		JTextField customernameText = new JTextField();
		customernameText.setBounds(100, 40, 160, 25);
		Loginframe.add(customernameText);
		cname = customernameText.getText();

		JLabel customeraddrLabel = new JLabel("Address");
		customeraddrLabel.setBounds(10, 70, 100, 25);
		Loginframe.add(customeraddrLabel);

		JTextField customeraddrText = new JTextField();
		customeraddrText.setBounds(100, 70, 160, 25);
		Loginframe.add(customeraddrText);
		caddr = customeraddrText.getText();

		JLabel customeremailLabel = new JLabel("Email Address");
		customeremailLabel.setBounds(10, 100, 100, 25);
		Loginframe.add(customeremailLabel);

		JTextField customeremailText = new JTextField();
		customeremailText.setBounds(100, 100, 160, 25);
		Loginframe.add(customeremailText);
		cemail = customeremailText.getText();

		JLabel customernoLabel = new JLabel("Phone Number");
		customernoLabel.setBounds(10, 140, 100, 25);
		Loginframe.add(customernoLabel);

		JTextField customernoText = new JTextField();
		customernoText.setBounds(100, 140, 160, 25);
		Loginframe.add(customernoText);
		ctelno = customernoText.getText();

		JLabel ratingLabel = new JLabel("Rating");
		ratingLabel.setBounds(10, 170, 100, 25);
		Loginframe.add(ratingLabel);

		JRadioButton r1 = new JRadioButton("Standard");
		JRadioButton r2 = new JRadioButton("Premium");
		r1.setBounds(10, 200, 100, 25);
		r2.setBounds(10, 225, 100, 25);

		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		Loginframe.add(r1);
		Loginframe.add(r2);

		final JButton loginButton = new JButton("Register");
		loginButton.setBounds(100, 250, 100, 25);
		Loginframe.add(loginButton);

		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == loginButton)
					JOptionPane.showMessageDialog(Loginframe, "Registered Successfully");
				Loginframe.dispose();
				// HomePage.init();
			}

		});

	}

}
