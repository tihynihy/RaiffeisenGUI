package tihy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class depositFrame implements ActionListener{


    JFrame frame;
    JPanel mainPanel;
    JTextField ammountField;
    JButton submitButton;
    JLabel addLabel;
    JButton toMainButton;


   public depositFrame(){


    ImageIcon addLogo = new ImageIcon("reklama.png");

    Image addLogoImage = addLogo.getImage();
    Image modifiedAddLogo = addLogoImage.getScaledInstance(350,350, Image.SCALE_SMOOTH);
    addLogo = new ImageIcon(modifiedAddLogo);



     addLabel = new JLabel();
     addLabel.setBounds(320,50,350,350);
     addLabel.setIcon(addLogo);


     toMainButton = new JButton();
     toMainButton.setFocusable(false);
     toMainButton.setBounds(80,325,130,50);
     toMainButton.setText("BACK TO MAIN");



      submitButton = new JButton();
      submitButton.setBounds(80,260,100,50);
      submitButton.setFocusable(false);
      submitButton.setText("SUBMIT");
      submitButton.addActionListener(this);



       ammountField = new JTextField();
       ammountField.setBounds(80,200,200,50);
       ammountField.setFont(new Font("Monaco", Font.PLAIN, 20));



       ImageIcon logo = new ImageIcon("logo.png");
       JLabel logoLabel = new JLabel();
       logoLabel.setIcon(logo);
       logoLabel.setBounds(80,0,200,200);



        mainPanel = new JPanel();
        mainPanel.setBounds(0,0,750,500);
        mainPanel.setBackground(new Color(224, 231, 9));
        mainPanel.add(logoLabel);
        mainPanel.add(submitButton);
        mainPanel.add(ammountField);
        mainPanel.add(addLabel);
        mainPanel.add(toMainButton);
        mainPanel.setLayout(null);


        ImageIcon mainLogo = new ImageIcon("mainLogo.jpg");
        frame = new JFrame();
        frame.setIconImage(mainLogo.getImage());
        frame.setSize(750,500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(224, 231, 9));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Raiffaisen - Deposit Tab");
        frame.setResizable(false);
        frame.add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(false);

    }

 @Override
 public void actionPerformed(ActionEvent e) {

  if(e.getSource()==submitButton){

   System.out.println("Deposited: "+ammountField.getText()+" KM");
   toMainButton.setVisible(true);

  }

 }
}
