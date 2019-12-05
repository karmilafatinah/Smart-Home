package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setForeground(new Color(135, 206, 250));
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 736, 505);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRegister = new JLabel("REGISTER");
		lblRegister.setBounds(274, -14, 181, 98);
		lblRegister.setFont(new Font("Segoe UI Semibold", Font.BOLD, 38));
		lblRegister.setForeground(new Color(255, 255, 255));
		panel.add(lblRegister);
		
		JLabel lblEnterUsername = new JLabel("Enter username:");
		lblEnterUsername.setBounds(199, 63, 162, 40);
		lblEnterUsername.setForeground(new Color(255, 255, 255));
		lblEnterUsername.setBackground(new Color(255, 255, 255));
		panel.add(lblEnterUsername);
		
		JLabel lblNewLabel = new JLabel("Re-enter your username:");
		lblNewLabel.setBounds(199, 129, 266, 40);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(199, 100, 353, 26);
		textField.setForeground(new Color(135, 206, 250));
		textField.setBackground(new Color(255, 255, 255));
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 164, 353, 26);
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(199, 224, 353, 26);
		textField_3.setBackground(new Color(255, 255, 255));
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		JLabel lblEnterPhoneNumber = new JLabel("Enter phone number:");
		lblEnterPhoneNumber.setBounds(199, 251, 162, 40);
		lblEnterPhoneNumber.setForeground(Color.WHITE);
		lblEnterPhoneNumber.setBackground(Color.WHITE);
		panel.add(lblEnterPhoneNumber);
		
		textField_4 = new JTextField();
		textField_4.setBounds(199, 286, 353, 26);
		textField_4.setBackground(new Color(255, 255, 255));
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		JLabel lblEnterPassword = new JLabel("Enter password:");
		lblEnterPassword.setBounds(199, 316, 162, 40);
		lblEnterPassword.setForeground(Color.WHITE);
		lblEnterPassword.setBackground(Color.WHITE);
		panel.add(lblEnterPassword);
		
		JLabel lblRenterPassword = new JLabel("Re-nter password:");
		lblRenterPassword.setBounds(199, 372, 162, 40);
		lblRenterPassword.setForeground(Color.WHITE);
		lblRenterPassword.setBackground(Color.WHITE);
		panel.add(lblRenterPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(199, 349, 353, 26);
		passwordField.setBackground(new Color(255, 255, 255));
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			mainpage k = new mainpage();
			k.setVisible(true);
			dispose();
			}
		});
		btnNewButton.setBounds(236, 458, 115, 29);
		btnNewButton.setBackground(new Color(255, 255, 255));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CONFIRM");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login i = new Login();
				i.setVisible(true);
				dispose();
			}
			
		});
		btnNewButton_1.setBounds(378, 458, 115, 29);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		panel.add(btnNewButton_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(199, 407, 353, 26);
		passwordField_1.setBackground(Color.WHITE);
		panel.add(passwordField_1);
		
		JLabel lblEnterEmail = new JLabel("Enter email:");
		lblEnterEmail.setForeground(Color.WHITE);
		lblEnterEmail.setBounds(199, 185, 266, 40);
		panel.add(lblEnterEmail);
	}
}
