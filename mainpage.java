package GUI;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import keeptoo.KGradientPanel;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;
import keeptoo.KButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import keeptoo.KTextField;

public class mainpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainpage frame = new mainpage();
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
	public mainpage() {
		super("Main");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 561);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkStartColor(new Color(135, 206, 235));
		gradientPanel.setkEndColor(new Color(224, 255, 255));
		gradientPanel.setBounds(0, 0, 727, 505);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(386, 0, 634, 505);
		gradientPanel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(mainpage.class.getResource("/Images/house.png")));

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(26, 101, 344, 248);
		gradientPanel.add(panel);
		panel.setLayout(null);

		JLabel label_1 = new JLabel("SMART HOME SYSTEM");
		label_1.setBounds(23, 89, 321, 44);
		panel.add(label_1);
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setFont(new Font("Dialog", Font.BOLD, 27));

		JLabel lblSmartHomeSystem = new JLabel("WELCOME TO");
		lblSmartHomeSystem.setBounds(125, 60, 121, 25);
		panel.add(lblSmartHomeSystem);
		lblSmartHomeSystem.setBackground(new Color(30, 144, 255));
		lblSmartHomeSystem.setForeground(new Color(255, 255, 255));
		lblSmartHomeSystem.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 18));

		JLabel lblAlreadyAMember = new JLabel("or");
		lblAlreadyAMember.setBackground(new Color(0, 0, 0));
		lblAlreadyAMember.setForeground(new Color(255, 255, 255));
		lblAlreadyAMember.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 14));
		lblAlreadyAMember.setBounds(168, 158, 19, 20);
		panel.add(lblAlreadyAMember);

		JLabel label = new JLabel("");
		label.setForeground(new Color(255, 255, 255));
		label.setIcon(new ImageIcon(mainpage.class.getResource("/Images/icons8-home-safety-40 (1).png")));
		label.setBounds(83, 52, 115, 33);
		panel.add(label);

		KButton btnLogin = new KButton();
		btnLogin.setkSelectedColor(new Color(30, 144, 255));
		btnLogin.setkHoverStartColor(new Color(30, 144, 255));
		btnLogin.kHoverForeGround = new Color(176, 224, 230);
		btnLogin.setkHoverForeGround(new Color(176, 224, 230));
		btnLogin.setkStartColor(new Color(0, 191, 255));
		btnLogin.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 15));
		btnLogin.setText("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				l.setVisible(true);
				dispose();
			}
		});
		btnLogin.setBounds(49, 145, 105, 44);
		btnLogin.setIcon(new ImageIcon(mainpage.class.getResource("/Images/icons8-registration-24.png")));
		panel.add(btnLogin);

		KButton btnRegister = new KButton();
		btnRegister.setkSelectedColor(new Color(30, 144, 255));
		btnRegister.setkHoverStartColor(new Color(30, 144, 255));
		btnRegister.kHoverForeGround = new Color(176, 224, 230);
		btnRegister.setkHoverForeGround(new Color(176, 224, 230));
		btnRegister.setIcon(new ImageIcon(mainpage.class.getResource("/Images/icons8-test-passed-24.png")));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register r = new Register();
				r.setVisible(true);
				dispose();
			}
		});
		btnRegister.setText("    REGISTER");
		btnRegister.kStartColor = new Color(0, 191, 255);
		btnRegister.setkStartColor(new Color(0, 191, 255));
		btnRegister.setkHoverForeGround(new Color(176, 224, 230));
		btnRegister.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 15));
		btnRegister.setBounds(192, 145, 105, 44);
		panel.add(btnRegister);
	


}

}
