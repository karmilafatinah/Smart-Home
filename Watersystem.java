package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Watersystem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Watersystem frame = new Watersystem();
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
	public Watersystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 727, 505);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWaterFlow = new JLabel("Water");
		lblWaterFlow.setForeground(Color.WHITE);
		lblWaterFlow.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblWaterFlow.setBounds(305, 0, 98, 93);
		panel.add(lblWaterFlow);
		
		JButton btnNewButton_1 = new JButton("View Report");
		btnNewButton_1.setBounds(375, 460, 149, 29);
		panel.add(btnNewButton_1);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Interface2 h = new Interface2();
				h.setVisible(true);
				dispose();
			}
		});
		btnHome.setBounds(181, 460, 149, 29);
		panel.add(btnHome);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Watersystem.class.getResource("/Images/\u2014Pngtree\u2014circle pattern_2260889.png")));
		lblNewLabel.setBounds(-240, 0, 1097, 450);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("67");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 97));
		lblNewLabel_1.setBounds(300, 224, 114, 93);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gallon Used");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(291, 333, 135, 32);
		panel.add(lblNewLabel_2);
		
		JLabel lblYoureSecure = new JLabel("You're Secured!");
		lblYoureSecure.setFont(new Font("Tahoma", Font.ITALIC, 40));
		lblYoureSecure.setBounds(231, 109, 287, 70);
		panel.add(lblYoureSecure);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(231, 165, 264, 4);
		panel.add(panel_1);
		
		JLabel lblPipingStatus = new JLabel("Piping status:");
		lblPipingStatus.setBounds(231, 96, 127, 20);
		panel.add(lblPipingStatus);
	}
}
