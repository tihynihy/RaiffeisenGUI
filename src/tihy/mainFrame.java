package tihy;

import dataBase.userData;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class mainFrame extends JFrame implements ActionListener, MouseListener {
    JFrame frame;
    JButton button;
    JTextField userField;
    JPasswordField passField;
    JPanel importDataPanel;
    Border blackBorder;
    userData user = new userData();

    public mainFrame(){

        frame = new JFrame();
        ImageIcon logo = new ImageIcon("logo.png");
        ImageIcon mainLogo = new ImageIcon("mainLogo.jpg");
        JLabel logoLabel = new JLabel();
        blackBorder = BorderFactory.createLineBorder(Color.black,2);


        logoLabel.setIcon(logo);
        logoLabel.setBounds(80,0,200,200);

        userField = new JTextField();
        userField.setBounds(40,170,200,35);
        userField.setText("  Username");
        userField.setFont(new Font("Monaco", Font.PLAIN, 14));
        userField.setBorder(blackBorder);

        passField = new JPasswordField();
        passField.setBounds(40,215,200,35);
        passField.setBorder(blackBorder);
        passField.setColumns( 20 );



        button = new JButton();
        button.setText("LOG IN");
        button.setBounds(150,265,90,50);
        button.setFocusable(false);
        button.setBackground(new Color(0,0,0));
        button.setForeground(new Color(224, 231, 9));
        button.addActionListener(this);
        button.addMouseListener(this);

        importDataPanel = new JPanel();
        importDataPanel.setLayout(null);
        importDataPanel.setBounds(0,0,350,360);
        importDataPanel.add(button);
        importDataPanel.setBackground(new Color(224, 231, 9));
        importDataPanel.add(userField);
        importDataPanel.add(passField);
        importDataPanel.add(logoLabel);



        frame.setSize(360,400);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0,0,0));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setTitle("Raiffaisen - Log in System");
        frame.setIconImage(mainLogo.getImage());
        frame.add(importDataPanel);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){

            if(userField.getText().equals(user.getUser10())){
                System.out.println("Welcome "+user.getUser10());
                frame.dispose();
                optionFrame optFrame = new optionFrame();
                optFrame.frame.setVisible(true);
            }
            else if(userField.getText().equals(user.getUser11())){
                System.out.println("Welcome "+user.getUser11());
                frame.dispose();
                optionFrame optFrame = new optionFrame();
                optFrame.frame.setVisible(true);

            }
            else if(userField.getText().equals(user.getUser007())){
                System.out.println("Welcome "+user.getUser007());
                frame.dispose();
                optionFrame optFrame = new optionFrame();
                optFrame.frame.setVisible(true);
            }
            else {
                System.out.println("Invalid password / username");
            }


        }
        }

        //notUsed
    @Override
    public void mouseClicked(MouseEvent e) {

    }
    @Override
    public void mousePressed(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }


    @Override
    public void mouseEntered(MouseEvent e) {
        button.setBackground(new Color(224,231,9));
        button.setForeground(new Color(0,0,0));
        button.setBorder(blackBorder);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        button.setBackground(new Color(0,0,0));
        button.setForeground(new Color(224, 231, 9));
    }
}

