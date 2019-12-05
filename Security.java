package GUI;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import keeptoo.KGradientPanel;


public class Security extends JFrame{
    JLabel pic;
    Timer tm;
    int x = 0;
    //Images Path In Array
    String[] list = {
                      "C:\\Users\\halid\\Desktop\\valence.png",//0
                      "C:\\Users\\halid\\Desktop\\bedroom1.png",//1
                      "C:\\Users\\halid\\Desktop\\bedroom2.png",//2
                      "C:\\Users\\halid\\Desktop\\kitchen.png",//3
                      "C:\\Users\\halid\\Desktop\\backyard.png",//4
                      "C:\\Users\\halid\\Desktop\\frontyard.png",//5
                      "C:\\Users\\halid\\Desktop\\diningroom.png",//6
                    };
   
    public Security(){
        super("CCTV");
        getContentPane().setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 27));
        setBounds(100, 100, 749, 561);
        getContentPane().setBounds(100, 100, 749, 561);
       
        pic = new JLabel();
        pic.setBounds(new Rectangle(100, 100, 749, 561));
        pic.setBounds(68, 72, 461, 308);
       
       

        //Call The Function SetImageSize
        SetImageSize(6);
               //set a timer
        tm = new Timer(3500,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0;
            }
        });
       
        getContentPane().add(pic);
        tm.start();
        getContentPane().setLayout(null);
        setSize(749, 561);
        getContentPane().setBackground(new Color (135, 206, 250));
       
        String camera[] ={"CAMERA 1","CAMERA 2","CAMERA 3","CAMERA 4","CAMERA 5","CAMERA 6"};  
        JComboBox comboBox = new JComboBox(camera);  
        comboBox.setBounds(570, 213, 109, 22);
        getContentPane().add(comboBox);
       
        JLabel lblCctvView = new JLabel("CAMERA VIEW");
        lblCctvView.setForeground(Color.WHITE);
        lblCctvView.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 15));
        lblCctvView.setBounds(247, 39, 109, 33);
        getContentPane().add(lblCctvView);
       
        JLabel label_1 = new JLabel("");
        label_1.setIcon(new ImageIcon(Security.class.getResource("/Images/icons8-wall-mount-camera-20.png")));
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 10));
        label_1.setBounds(231, 39, 20, 33);
        getContentPane().add(label_1);
       
        KGradientPanel gradientPanel = new KGradientPanel();
        gradientPanel.setkEndColor(new Color(152, 251, 152));
        gradientPanel.setkStartColor(new Color(60, 179, 113));
        gradientPanel.setBounds(68, 398, 461, 28);
        getContentPane().add(gradientPanel);
       
        JLabel lblStatusNoSuspicious = new JLabel("STATUS: NO SUSPICIOUS MOTION DETECTED");
        gradientPanel.add(lblStatusNoSuspicious);
        lblStatusNoSuspicious.setForeground(Color.WHITE);
        lblStatusNoSuspicious.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 10));
       
        JLabel label = new JLabel("");
        gradientPanel.add(label);
        label.setIcon(new ImageIcon(Security.class.getResource("/Images/icons8-checked-radio-button-20.png")));
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 10));
       
        JLabel lblCameraOption = new JLabel("CAMERA OPTION");
        lblCameraOption.setForeground(Color.WHITE);
        lblCameraOption.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 15));
        lblCameraOption.setBounds(560, 180, 131, 33);
        getContentPane().add(lblCameraOption);
       
        JButton btnHome = new JButton("HOME");
        btnHome.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 16));
        btnHome.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
        	
        	Interface2 h = new Interface2();
        	h.setVisible(true);
        	dispose();
        	
        }
        });
        btnHome.setBounds(570, 398, 109, 28);
        getContentPane().add(btnHome);
       
        setBounds(100, 100, 749, 561);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    //create a function to resize the image
    public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }

public static void main(String[] args){
     
    new Security();
}
}

