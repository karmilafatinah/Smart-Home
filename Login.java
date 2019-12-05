package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import keeptoo.KGradientPanel;
import keeptoo.KTextField;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	JTextField textField;
	JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		super("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 561);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color (135, 206, 250));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		gradientPanel.setBounds(194, 42, 337, 379);
		gradientPanel.setkStartColor(new Color(135, 206, 235));
		gradientPanel.setkEndColor(new Color(224, 255, 255));
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(118, 28, 100, 100);
		gradientPanel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Images/icons8-male-user-100 (1).png")));

		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(45, 237, 86, 33);
		gradientPanel.add(lblPassword);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 18));

		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(45, 166, 86, 33);
		gradientPanel.add(lblUsername);
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 18));

		textField = new JTextField();
		textField.setBounds(45, 196, 236, 25);
		gradientPanel.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(45, 273, 236, 25);
		gradientPanel.add(passwordField);

		JButton button = new JButton("LOGIN");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().isEmpty() || passwordField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Input Username and Password.");

				} else if (textField.getText().equals("admin") && passwordField.getText().contentEquals("1234")) {

					Interface2 m = new Interface2();
					m.setVisible(true);
					dispose();


				} else {
					JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
				}

			}
		});



		button.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 16));
		button.setBounds(118, 323, 93, 28);
		gradientPanel.add(button);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage m = new mainpage();
				m.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 16));
		btnBack.setBounds(619, 461, 93, 28);
		contentPane.add(btnBack);
	}




}

