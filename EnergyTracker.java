package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JList;
import java.awt.Scrollbar;
import java.util.Calendar;
import java.util.Date;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.SpinnerDateModel;
import javax.swing.JPanel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.components.JLocaleChooser;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EnergyTracker {

	JFrame frame;
	private JTextField limitValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnergyTracker window = new EnergyTracker();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EnergyTracker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 102, 204));
		frame.setBounds(100, 100, 749, 561);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data Report Time");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(75, 74, 131, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("Set Limit");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(75, 136, 70, 31);
		frame.getContentPane().add(label);
		
		JSlider LimitSlider = new JSlider();
		LimitSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				updateValues();
			}
			
			private void updateValues() {
				limitValue.setText(LimitSlider.getValue()+"%");
			}
			
		});
		LimitSlider.setBackground(Color.WHITE);
		LimitSlider.setBounds(242, 141, 200, 26);
		frame.getContentPane().add(LimitSlider);
		
		JLabel lblNewLabel_1 = new JLabel("Energy");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 690, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 128));
		panel.setBounds(549, 104, 109, 31);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Confirm");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(75, 123, 432, 2);
		frame.getContentPane().add(separator);
		
		limitValue = new JTextField();
		limitValue.setBounds(455, 141, 37, 26);
		frame.getContentPane().add(limitValue);
		limitValue.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(242, 74, 109, 31);
		frame.getContentPane().add(dateChooser);
				
		JSpinner DateSpinner = new JSpinner();
		Date date = new Date();
		SpinnerDateModel ms =
		new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
		DateSpinner = new javax.swing.JSpinner(ms);
		DateSpinner.setBounds(380, 74, 37, 31);
		frame.getContentPane().add(DateSpinner);
		
		JSpinner.DateEditor de = new JSpinner.DateEditor(DateSpinner, "HH");
		DateSpinner.setEditor(de);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 216, 738, 306);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 102, 204));
		separator_1.setBounds(0, 36, 727, 14);
		panel_1.add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("House Area");
		lblNewLabel_3.setBounds(15, 0, 229, 41);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setBackground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JLabel lblNewLabel_4 = new JLabel("Kitchen");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(32, 123, 103, 25);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblLivingRoom = new JLabel("Living Room");
		lblLivingRoom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLivingRoom.setBounds(32, 52, 103, 25);
		panel_1.add(lblLivingRoom);
		
		JLabel lblBedroom = new JLabel("Bedroom 1");
		lblBedroom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBedroom.setBounds(32, 75, 103, 25);
		panel_1.add(lblBedroom);
		
		JLabel lblOutdoor = new JLabel("Outdoor");
		lblOutdoor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOutdoor.setBounds(32, 146, 103, 27);
		panel_1.add(lblOutdoor);
		
		JLabel lblBedroom_1 = new JLabel("Bedroom 2");
		lblBedroom_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBedroom_1.setBounds(32, 98, 103, 25);
		panel_1.add(lblBedroom_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(32, 75, 103, 2);
		panel_1.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(32, 98, 103, 2);
		panel_1.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(32, 121, 103, 2);
		panel_1.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(32, 146, 103, 2);
		panel_1.add(separator_5);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(68);
		progressBar.setStringPainted(true);
		progressBar.setBounds(158, 61, 263, 16);
		panel_1.add(progressBar);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(24);
		progressBar_1.setStringPainted(true);
		progressBar_1.setBounds(158, 84, 263, 16);
		panel_1.add(progressBar_1);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setValue(30);
		progressBar_2.setStringPainted(true);
		progressBar_2.setBounds(158, 107, 263, 16);
		panel_1.add(progressBar_2);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setValue(46);
		progressBar_3.setStringPainted(true);
		progressBar_3.setBounds(158, 132, 263, 16);
		panel_1.add(progressBar_3);
		
		JProgressBar progressBar_4 = new JProgressBar();
		progressBar_4.setValue(11);
		progressBar_4.setStringPainted(true);
		progressBar_4.setBounds(158, 157, 263, 16);
		panel_1.add(progressBar_4);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interface2 q = new Interface2();
				q.setVisible(true);
				frame.dispose();

			
			}
		});
		btnBack.setBounds(544, 234, 115, 29);
		panel_1.add(btnBack);
	}

	
}
