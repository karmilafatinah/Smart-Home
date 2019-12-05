package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import java.awt.Scrollbar;
import java.awt.ScrollPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import keeptoo.KButton;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Dashoard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashoard frame = new Dashoard();
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
	public Dashoard() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 749, 561);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 727, 87);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User's Home");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		lblNewLabel.setBounds(60, 16, 202, 41);
		panel.add(lblNewLabel);
		
		JLabel lblpm = new JLabel("5.43pm");
		lblpm.setBackground(new Color(240, 240, 240));
		lblpm.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 15));
		lblpm.setBounds(60, 51, 69, 20);
		panel.add(lblpm);
		
		JButton btnActivity = new JButton("Home");
		btnActivity.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Interface2 i = new Interface2();
				i.setVisible(true);
				dispose();
				// TODO Auto-generated method stub
				
			}
			
		});
		btnActivity.setBackground(UIManager.getColor("Button.highlight"));
		btnActivity.setBounds(404, 29, 115, 29);
		panel.add(btnActivity);
		
		JButton btnSettings = new JButton("Adjustment");
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					//setDefaultCloseOperation();
					//JFrame.EXIT_ON_CLOSE;
					AdjustSystem as = new AdjustSystem();
					as.setVisible(true);
					dispose();
			}
		});
		btnSettings.setBackground(UIManager.getColor("Button.background"));
		btnSettings.setBounds(584, 29, 115, 29);
		panel.add(btnSettings);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(65, 105, 225));
		panel_1.setBounds(386, 85, 176, 194);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTotalLamps = new JLabel("Total Lamps");
		lblTotalLamps.setForeground(new Color(255, 255, 255));
		lblTotalLamps.setBackground(new Color(255, 255, 255));
		lblTotalLamps.setBounds(36, 135, 103, 32);
		panel_1.add(lblTotalLamps);
		
		JLabel label_1 = new JLabel("15");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		label_1.setForeground(Color.WHITE);
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(67, 40, 94, 79);
		panel_1.add(label_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(100, 149, 237));
		panel_2.setBounds(561, 85, 176, 194);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblActiveLamps = new JLabel("Active Lamps");
		lblActiveLamps.setBounds(34, 142, 101, 20);
		lblActiveLamps.setForeground(Color.WHITE);
		lblActiveLamps.setBackground(Color.WHITE);
		panel_2.add(lblActiveLamps);
		
		JLabel label_2 = new JLabel("4");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(67, 43, 94, 79);
		panel_2.add(label_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(386, 331, 176, 174);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblc = new JLabel("23\u00B0C");
		lblc.setForeground(Color.BLACK);
		lblc.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblc.setBackground(Color.WHITE);
		lblc.setBounds(41, 52, 94, 79);
		panel_3.add(lblc);
		
		JLabel lblCurrent = new JLabel("Current");
		lblCurrent.setBounds(46, 132, 74, 20);
		panel_3.add(lblCurrent);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(null);
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(561, 331, 176, 174);
		contentPane.add(panel_4);
		
		JLabel lblc_1 = new JLabel("21\u00B0C");
		lblc_1.setForeground(Color.BLACK);
		lblc_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblc_1.setBackground(Color.WHITE);
		lblc_1.setBounds(43, 53, 94, 79);
		panel_4.add(lblc_1);
		
		JLabel lblTargeted = new JLabel("Target");
		lblTargeted.setBounds(46, 127, 74, 20);
		panel_4.add(lblTargeted);
		
		JLabel lblNewLabel_2 = new JLabel("General Temperature");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(386, 284, 306, 42);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 85, 385, 420);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(15, 134, 355, 270);
		label.setIcon(new ImageIcon(Dashoard.class.getResource("/Images/energy2.png")));
		panel_5.add(label);
		
		JLabel lblTotalPowerConsumption = new JLabel("Total Power Consumption");
		lblTotalPowerConsumption.setBounds(15, 16, 328, 52);
		lblTotalPowerConsumption.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTotalPowerConsumption.setForeground(new Color(0, 0, 0));
		panel_5.add(lblTotalPowerConsumption);
		
		JLabel lblNewLabel_1 = new JLabel("79 KWH");
		lblNewLabel_1.setBounds(15, 84, 132, 33);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_5.add(lblNewLabel_1);
		
		JLabel lblCurrentMonth = new JLabel("Current Month");
		lblCurrentMonth.setBounds(251, 216, 129, 20);
		panel_5.add(lblCurrentMonth);
		
		JLabel lblLastMonth = new JLabel("Last Month");
		lblLastMonth.setBounds(251, 354, 92, 20);
		panel_5.add(lblLastMonth);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
