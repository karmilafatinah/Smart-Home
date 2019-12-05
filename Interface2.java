package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import keeptoo.KButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import keeptoo.KGradientPanel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;

public class Interface2 extends JFrame {

	public JPanel contentPane;
	public JRadioButton radAway;
	public JRadioButton radHome;
	public final ButtonGroup buttonGroup = new ButtonGroup();
	public JLabel RoutineLabel;
	public JTextField UserInput;
	public JButton Display;
	public JLabel output1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface2 frame = new Interface2();
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
	public Interface2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 561);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 809, 137);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hello ");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		lblNewLabel.setBounds(40, 35, 80, 41);
		panel.add(lblNewLabel);
		
		JLabel lblCurrentlyYouAre = new JLabel("Currently you are ");
		lblCurrentlyYouAre.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblCurrentlyYouAre.setBackground(Color.WHITE);
		lblCurrentlyYouAre.setBounds(40, 80, 155, 29);
		panel.add(lblCurrentlyYouAre);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(Interface2.class.getResource("/Images/on2.png")));
		button.setBounds(780, 0, 29, 21);
		panel.add(button);
		
		RoutineLabel = new JLabel("");
		RoutineLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		RoutineLabel.setBounds(210, 80, 87, 29);
		panel.add(RoutineLabel);
		
		output1 = new JLabel("");
		output1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		output1.setBackground(Color.WHITE);
		output1.setBounds(120, 35, 148, 41);
		panel.add(output1);
		
		JLabel lblRoutines = new JLabel("Status\r\n");
		lblRoutines.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
		lblRoutines.setBackground(Color.BLACK);
		lblRoutines.setBounds(53, 319, 69, 20);
		contentPane.add(lblRoutines);
		
		radHome = new JRadioButton("Home");
		buttonGroup.add(radHome);
		radHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radHome.isSelected())
					radAway.setSelected(false);
				RoutineLabel.setText(radHome.getText());
			}
		});
		radHome.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
		radHome.setBounds(118, 464, 77, 29);
		contentPane.add(radHome);
		
		radAway = new JRadioButton("Away");
		buttonGroup.add(radAway);
		radAway.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(radAway.isSelected())
					radHome.setSelected(false);
				RoutineLabel.setText(radAway.getText());
			}
		});
		radAway.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
		radAway.setBounds(118, 391, 77, 29);
		contentPane.add(radAway);
		
		JLabel lblFavouriteDevices = new JLabel("Favourite devices");
		lblFavouriteDevices.setBackground(new Color(255, 99, 71));
		lblFavouriteDevices.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
		lblFavouriteDevices.setBounds(526, 153, 133, 23);
		contentPane.add(lblFavouriteDevices);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Interface2.class.getResource("/Images/cctv.png")));
		label.setBounds(601, 186, 77, 97);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Interface2.class.getResource("/Images/HOME.png")));
		label_1.setBounds(30, 424, 77, 81);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Interface2.class.getResource("/Images/lock1.png")));
		label_2.setBounds(25, 344, 82, 89);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Interface2.class.getResource("/Images/window.png")));
		label_3.setBounds(467, 175, 77, 97);
		contentPane.add(label_3);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(Interface2.class.getResource("/Images/water.png")));
		label_5.setBounds(611, 299, 77, 97);
		contentPane.add(label_5);
		
		JButton btnCctv = new JButton("CCTV");
		btnCctv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Security s = new Security();
				s.setVisible(true);
				dispose();
			}
		});
		btnCctv.setBackground(UIManager.getColor("Button.background"));
		btnCctv.setBounds(590, 276, 98, 20);
		contentPane.add(btnCctv);
		
		JButton btnWindow = new JButton("WINDOW");
		btnWindow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WindowTint w = new WindowTint();
				w.setVisible(true);
				dispose();
			}
		});
		btnWindow.setBackground(UIManager.getColor("Button.background"));
		btnWindow.setBounds(451, 276, 109, 20);
		contentPane.add(btnWindow);
		
		JButton btnSensor = new JButton("ENERGY ");
		btnSensor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EnergyTracker window = new EnergyTracker();
				window.frame.setVisible(true);
				dispose();
			}
		});
		btnSensor.setBackground(UIManager.getColor("Button.background"));
		btnSensor.setBounds(446, 413, 98, 20);
		contentPane.add(btnSensor);
		
		JButton btnWater = new JButton("WATER");
		btnWater.setBackground(UIManager.getColor("Button.background"));
		btnWater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Watersystem ws = new Watersystem();
				ws.setVisible(true);
				dispose();
			}
		});
		btnWater.setBounds(593, 412, 98, 20);
		contentPane.add(btnWater);
		
		JButton btnAddNewDevice = new JButton("Dashboard");
		btnAddNewDevice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//supposedly dashboard but wrong spelling
				Dashoard d = new Dashoard();
				d.setVisible(true);
				dispose();
			}
		});
		btnAddNewDevice.setBounds(495, 464, 178, 29);
		contentPane.add(btnAddNewDevice);
		
		JLabel lblEnterYourNickname = new JLabel("Enter Your Nickname:");
		lblEnterYourNickname.setBounds(53, 153, 161, 20);
		contentPane.add(lblEnterYourNickname);
		
		UserInput = new JTextField();
		UserInput.setBounds(53, 216, 161, 26);
		contentPane.add(UserInput);
		UserInput.setColumns(10);
		
		Display = new JButton("Display");
		Display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				output1.setText(UserInput.getText() + " ! ");
				
				
			}
		});
		Display.setBounds(53, 258, 115, 29);
		contentPane.add(Display);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Interface2.class.getResource("/Images/energy3.png")));
		label_4.setBounds(461, 299, 77, 97);
		contentPane.add(label_4);
	}
}
