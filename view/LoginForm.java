package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm {

	public static void main(String[] args)  {
		JFrame frame = new JFrame("Login Page");
		frame.setSize(300, 150);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		insertComponents(frame);

		frame.setVisible(true);
	}
	public static void insertComponents(final JFrame frame) 
	{
		frame.setLayout(null);
		
		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		frame.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		frame.add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		frame.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		frame.add(passwordText);

		final JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 80, 80, 25);
		frame.add(loginButton);

		JButton registerButton = new JButton("register");
		registerButton.setBounds(180, 80, 80, 25);
		frame.add(registerButton);

		ActionListener loginButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== loginButton)
					JOptionPane.showMessageDialog(frame,"Login Successful");
					frame.dispose();
					//HomePage.init();
				
			}
		};
		loginButton.addActionListener(loginButtonListener);
		
		registerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== loginButton)
					JOptionPane.showMessageDialog(frame,"Welcome to Registration Page");
					frame.dispose();
					RegistrationForm.init();
			}		
		});
	}
	
	
	
}
