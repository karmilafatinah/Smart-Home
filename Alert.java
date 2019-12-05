package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import keeptoo.KButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

public class Alert extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alert frame = new Alert();
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
	public Alert() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 561);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 727, 193);
		panel.setBackground(Color.RED);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("3 MINUTES AGO");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		lblNewLabel.setBounds(242, 104, 211, 34);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Alert.class.getResource("/Images/alert3.png")));
		lblNewLabel_1.setBounds(319, 44, 41, 44);
		panel.add(lblNewLabel_1);
		
		JButton btnIgnoreAlert = new JButton("Ignore Alert");
		btnIgnoreAlert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Interface2 i = new Interface2();
				i.setVisible(true);
			}
		});
		btnIgnoreAlert.setBackground(UIManager.getColor("Button.focus"));
		btnIgnoreAlert.setBounds(597, 0, 130, 29);
		panel.add(btnIgnoreAlert);
		
		JLabel lblNewLabel_2 = new JLabel("Looks like there's some movement at home.  \r\n\r\n\r\n");
		lblNewLabel_2.setBounds(63, 209, 625, 113);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Are you expecting anyone?");
		lblNewLabel_3.setBounds(163, 299, 376, 41);
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Make a call");
		btnNewButton.setBounds(116, 437, 115, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnTriggerAlarm = new JButton("Trigger Alarm");
		btnTriggerAlarm.setBounds(276, 437, 133, 29);
		contentPane.add(btnTriggerAlarm);
		
		JButton btnViewCamera = new JButton("View Camera");
		btnViewCamera.setBounds(450, 437, 133, 29);
		contentPane.add(btnViewCamera);
	}
}
