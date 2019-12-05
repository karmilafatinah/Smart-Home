package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import keeptoo.KGradientPanel;

public class CleaningSystem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CleaningSystem frame = new CleaningSystem();
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
	public CleaningSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 561);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 727, 505);
		panel.setBackground(new Color(135, 206, 250));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDustPercentage = new JLabel("Dust Percentage");
		lblDustPercentage.setBounds(308, 279, 130, 38);
		panel.add(lblDustPercentage);
		
		JLabel lblCleaning = new JLabel("Cleaning System");
		lblCleaning.setForeground(Color.WHITE);
		lblCleaning.setBounds(259, 0, 241, 95);
		panel.add(lblCleaning);
		lblCleaning.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel label = new JLabel("");
		label.setBounds(-226, 65, 766, 615);
		panel.add(label);
		label.setIcon(new ImageIcon(CleaningSystem.class.getResource("/Images/Untitled.png")));
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(323, 460, 115, 29);
		panel.add(btnHome);
	}
}
