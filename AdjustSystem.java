package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import keeptoo.KGradientPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.SystemColor;

public class AdjustSystem extends JFrame {

	private JPanel contentPane;
	private JRadioButton radOn;
	private JRadioButton radOff;
	private JRadioButton radOn2;
	private JRadioButton radOff2;
	private JRadioButton radOn3;
	private JRadioButton radOff3;
	private JRadioButton radOn4;
	private JRadioButton radOff4;
	private JLabel label2;
	private JSlider slider2;
	private JLabel labelWater;
	private JLabel label31;
	private JSlider slider3;
	private JSlider sliderW;
	private JSlider slider;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdjustSystem frame = new AdjustSystem();
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
	public AdjustSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 561);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kGradientFocus = 600;
		gradientPanel.setkGradientFocus(400);
		gradientPanel.setBounds(0, 0, 724, 71);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblFavouriteAdjustment = new JLabel("Adjustment");
		lblFavouriteAdjustment.setForeground(Color.WHITE);
		lblFavouriteAdjustment.setBackground(Color.WHITE);
		lblFavouriteAdjustment.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFavouriteAdjustment.setBounds(322, 16, 215, 42);
		gradientPanel.add(lblFavouriteAdjustment);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(AdjustSystem.class.getResource("/Images/lghting.png")));
		label_1.setBounds(408, 87, 57, 51);
		contentPane.add(label_1);
		
		JLabel lblTemperature = new JLabel("Temperature");
		lblTemperature.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTemperature.setBounds(33, 144, 107, 20);
		contentPane.add(lblTemperature);
		
		JLabel lblLighting = new JLabel("Lighting");
		lblLighting.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLighting.setBounds(396, 144, 69, 20);
		contentPane.add(lblLighting);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AdjustSystem.class.getResource("/Images/temp3.png")));
		label.setBounds(71, 87, 57, 51);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(467, 90, 57, 51);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(452, 90, 57, 51);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(AdjustSystem.class.getResource("/Images/water3.png")));
		label_4.setBounds(265, 90, 57, 51);
		contentPane.add(label_4);
		
		JLabel lblWaterFlow = new JLabel("Water Flow");
		lblWaterFlow.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWaterFlow.setBounds(232, 144, 107, 20);
		contentPane.add(lblWaterFlow);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(565, 119, 69, 20);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(AdjustSystem.class.getResource("/Images/dust.png")));
		label_6.setBounds(587, 87, 57, 51);
		contentPane.add(label_6);
		
		JLabel lblDust = new JLabel("Humidity");
		lblDust.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDust.setBounds(597, 144, 107, 20);
		contentPane.add(lblDust);
		
		radOn = new JRadioButton("ON");
		radOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radOn.isSelected())
					radOff.setSelected(false);
			}
		});
		radOn.setBounds(125, 236, 61, 28);
		contentPane.add(radOn);
		
		radOff = new JRadioButton("OFF");
		radOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radOff.isSelected())
					radOn.setSelected(false);
			}
		});
		radOff.setBounds(125, 292, 61, 28);
		contentPane.add(radOff);
		
		radOff2 = new JRadioButton("OFF");
		radOff2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radOff2.isSelected())
					radOn2.setSelected(false);
			}
		});
		radOff2.setBounds(317, 292, 61, 28);
		contentPane.add(radOff2);
		
		radOn2 = new JRadioButton("ON");
		radOn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(radOn2.isSelected())
					radOff.setSelected(false);
			}
		});
		radOn2.setBounds(317, 236, 61, 28);
		contentPane.add(radOn2);
		
		radOn3 = new JRadioButton("ON");
		radOn3.setBounds(504, 236, 61, 28);
		contentPane.add(radOn3);
		
		radOff3 = new JRadioButton("OFF");
		radOff3.setBounds(504, 292, 61, 28);
		contentPane.add(radOff3);
		
		radOff4 = new JRadioButton("OFF");
		radOff4.setBounds(655, 292, 61, 28);
		contentPane.add(radOff4);
		
		radOn4 = new JRadioButton("ON");
		radOn4.setBounds(655, 236, 61, 28);
		contentPane.add(radOn4);
		
		label2 = new JLabel("");
		label2.setBackground(UIManager.getColor("Label.disabledShadow"));
		label2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		label2.setBounds(66, 412, 57, 36);
		contentPane.add(label2);
		
		slider2 = new JSlider();
		slider2.setValue(22);
		slider2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label2.setText(Integer.toString(slider2.getValue()) + "°C ");
			}
		});
		slider2.setMajorTickSpacing(1);
		slider2.setSnapToTicks(true);
		slider2.setPaintTicks(true);
		slider2.setPaintLabels(true);
		slider2.setMinimum(18);
		slider2.setMaximum(24);
		slider2.setOrientation(SwingConstants.VERTICAL);
		slider2.setBackground(Color.WHITE);
		slider2.setBounds(56, 180, 53, 216);
		contentPane.add(slider2);
		
		labelWater = new JLabel("");
		labelWater.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		labelWater.setBackground(Color.WHITE);
		labelWater.setBounds(252, 412, 57, 36);
		contentPane.add(labelWater);
		
		label31 = new JLabel("");
		label31.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		label31.setBackground(Color.WHITE);
		label31.setBounds(430, 412, 57, 36);
		contentPane.add(label31);
		
		slider3 = new JSlider();
		slider3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				label31.setText(Integer.toString(slider3.getValue()) + "%");
			}
		});
		slider3.setValue(7);
		slider3.setSnapToTicks(true);
		slider3.setPaintTicks(true);
		slider3.setPaintLabels(true);
		slider3.setOrientation(SwingConstants.VERTICAL);
		slider3.setMaximum(10);
		slider3.setMajorTickSpacing(2);
		slider3.setBackground(Color.WHITE);
		slider3.setBounds(420, 180, 53, 216);
		contentPane.add(slider3);
		
		sliderW = new JSlider();
		sliderW.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				labelWater.setText(Integer.toString(sliderW.getValue()) + "psi");
			}
		});
		sliderW.setSnapToTicks(true);
		sliderW.setPaintTicks(true);
		sliderW.setPaintLabels(true);
		sliderW.setOrientation(SwingConstants.VERTICAL);
		sliderW.setMinimum(40);
		sliderW.setMaximum(50);
		sliderW.setMajorTickSpacing(1);
		sliderW.setBackground(Color.WHITE);
		sliderW.setBounds(242, 180, 53, 216);
		contentPane.add(sliderW);
		
		slider = new JSlider();
		slider.setValue(45);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.setMinimum(25);
		slider.setMaximum(45);
		slider.setMajorTickSpacing(5);
		slider.setBackground(Color.WHITE);
		slider.setBounds(587, 180, 53, 216);
		contentPane.add(slider);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dashoard d = new Dashoard();
				d.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(317, 460, 115, 29);
		contentPane.add(btnNewButton);
	}
}
