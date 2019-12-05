package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import keeptoo.KGradientPanel;
import javax.swing.border.MatteBorder;

public class WindowTint extends JFrame {


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowTint frame = new WindowTint();
					frame.setVisible(true);
	}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

/**
* Create the frame.
*/
	public WindowTint() {
		super("Window Tint Controller");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color (135, 206, 250));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		KGradientPanel bedroom = new KGradientPanel();
		bedroom.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 139)));
		bedroom.setkStartColor(new Color(135, 206, 235));
		bedroom.setkEndColor(new Color(224, 255, 255));
		bedroom.setBounds(95, 216, 218, 148);
		contentPane.add(bedroom);
		bedroom.setLayout(null);

		JLabel bdlabel = new JLabel("%");
		bdlabel.setBounds(167, 80, 37, 26);
		bdlabel.setForeground(new Color(255, 255, 255));
		bdlabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bedroom.add(bdlabel);

		JSlider bdslider = new JSlider();
		bdslider.setBounds(10, 109, 194, 26);
		bdslider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				bdlabel.setText(Integer.toString(bdslider.getValue()) + "%");
			}
		});
		bdslider.setPaintLabels(true);
		bdslider.setOpaque(false);
		bedroom.add(bdslider);

		JLabel lblBedroom = new JLabel("BEDROOM 1");
		lblBedroom.setBounds(10, 0, 114, 33);
		lblBedroom.setForeground(new Color(255, 255, 255));
		lblBedroom.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 16));
		bedroom.add(lblBedroom);

		JLabel lblWindowTintLevel = new JLabel("Window Tint Level:");
		lblWindowTintLevel.setBounds(20, 79, 150, 26);
		lblWindowTintLevel.setForeground(new Color(255, 255, 255));
		lblWindowTintLevel.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 15));
		bedroom.add(lblWindowTintLevel);

		JLabel label = new JLabel("");
		label.setBounds(82, 38, 59, 33);
		bedroom.add(label);
		label.setIcon(new ImageIcon(WindowTint.class.getResource("/Images/icons8-empty-bed-50 (1).png")));

		KGradientPanel bedroom2 = new KGradientPanel();
		bedroom2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 139)));
		bedroom2.setLayout(null);
		bedroom2.setkStartColor(new Color(135, 206, 235));
		bedroom2.setkEndColor(new Color(224, 255, 255));
		bedroom2.setBounds(392, 216, 218, 148);
		contentPane.add(bedroom2);

		JLabel bdlabel2 = new JLabel("%");
		bdlabel2.setForeground(Color.WHITE);
		bdlabel2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bdlabel2.setBounds(167, 79, 37, 26);
		bedroom2.add(bdlabel2);

		JSlider bdslider2 = new JSlider();
		bdslider2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				bdlabel2.setText(Integer.toString(bdslider2.getValue()) + "%");

			}
		});
		bdslider2.setPaintLabels(true);
		bdslider2.setOpaque(false);
		bdslider2.setBounds(10, 110, 194, 26);
		bedroom2.add(bdslider2);

		JLabel bd2 = new JLabel("BEDROOM 2");
		bd2.setForeground(Color.WHITE);
		bd2.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 16));
		bd2.setBounds(10, 0, 114, 33);
		bedroom2.add(bd2);

		JLabel label_2 = new JLabel("Window Tint Level:");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 15));
		label_2.setBounds(20, 78, 150, 26);
		bedroom2.add(label_2);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(WindowTint.class.getResource("/Images/icons8-empty-bed-50 (1).png")));
		label_1.setBounds(82, 39, 59, 33);
		bedroom2.add(label_1);
		
		KGradientPanel livingroom = new KGradientPanel();
		livingroom.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 139)));
		livingroom.setLayout(null);
		livingroom.setkStartColor(new Color(135, 206, 235));
		livingroom.setkEndColor(new Color(224, 255, 255));
		livingroom.setBounds(95, 38, 218, 148);
		contentPane.add(livingroom);
		
		JLabel lvlabel = new JLabel("%");
		lvlabel.setForeground(Color.WHITE);
		lvlabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lvlabel.setBounds(167, 80, 37, 26);
		livingroom.add(lvlabel);

		JSlider lvslider = new JSlider();
		lvslider.addChangeListener(new ChangeListener() {
		public void stateChanged(ChangeEvent e) {
		lvlabel.setText(Integer.toString(lvslider.getValue()) + "%");
		}
		});
		lvslider.setPaintLabels(true);
		lvslider.setOpaque(false);
		lvslider.setBounds(10, 111, 194, 26);
		livingroom.add(lvslider);

		JLabel lv = new JLabel("LIVING ROOM");
		lv.setForeground(Color.WHITE);
		lv.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 16));
		lv.setBounds(10, 0, 114, 33);
		livingroom.add(lv);
		
		JLabel label_5 = new JLabel("Window Tint Level:");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 15));
		label_5.setBounds(20, 79, 150, 26);
		livingroom.add(label_5);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(WindowTint.class.getResource("/Images/icons8-living-room-50.png")));
		label_4.setBounds(83, 41, 50, 33);
		livingroom.add(label_4);

		KGradientPanel kitchen = new KGradientPanel();
		kitchen.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 139)));
		kitchen.setLayout(null);
		kitchen.setkStartColor(new Color(135, 206, 235));
		kitchen.setkEndColor(new Color(224, 255, 255));
		kitchen.setBounds(392, 38, 218, 148);
		contentPane.add(kitchen);
		
		JLabel klabel = new JLabel("%");
		klabel.setForeground(Color.WHITE);
		klabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		klabel.setBounds(167, 81, 37, 26);
		kitchen.add(klabel);
	
		
		JSlider kslider = new JSlider();
		kslider.addChangeListener(new ChangeListener() {
		public void stateChanged(ChangeEvent e) {
		klabel.setText(Integer.toString(kslider.getValue()) + "%");
		}
		});
		kslider.setPaintLabels(true);
		kslider.setOpaque(false);
		kslider.setBounds(10, 111, 194, 26);
		kitchen.add(kslider);
		
		JLabel lblKitchen = new JLabel("KITCHEN");
		lblKitchen.setForeground(Color.WHITE);
		lblKitchen.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 16));
		lblKitchen.setBounds(10, 0, 114, 33);
		kitchen.add(lblKitchen);
			
		JLabel label_3 = new JLabel("Window Tint Level:");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 15));
		label_3.setBounds(20, 80, 150, 26);
		kitchen.add(label_3);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(WindowTint.class.getResource("/Images/icons8-kitchen-room-50.png")));
		label_6.setBounds(77, 28, 64, 48);
		kitchen.add(label_6);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkEndColor(new Color(152, 251, 152));
		gradientPanel.setkStartColor(new Color(60, 179, 113));
		gradientPanel.setBounds(95, 390, 515, 28);
		getContentPane().add(gradientPanel);
		
		JLabel lblStatusNoSuspicious = new JLabel("STATUS: CURRENT HOUSE TEMPERATURE IS UNDER 30\u00B0C");
		gradientPanel.add(lblStatusNoSuspicious);
		lblStatusNoSuspicious.setForeground(Color.WHITE);
		lblStatusNoSuspicious.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 10));
	
		JButton btnHome = new JButton("HOME");
		btnHome.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 16));
		btnHome.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Interface2 i = new Interface2();
			i.setVisible(true);
			dispose();
		}
		});
		btnHome.setBounds(308, 431, 93, 28);
		getContentPane().add(btnHome);
		
		}
		}
	
