package tihy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class optionFrame implements ActionListener {


    JFrame frame;
    JPanel mainPanel;
    JLabel titleLabel;
    JButton depButton;
    JButton wdButton;
    JButton optionButton;
    JButton exChangeButton;
    JButton backButton;


    optionFrame(){

        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.BLACK);
        blackPanel.setBounds(0,350,750,50);


        //-----------------------------------------------------------------------------------------
        ImageIcon backButtonLogo = new ImageIcon("backArrow.png");

        Image backButtonLogoImage = backButtonLogo.getImage();
        Image modifiedBackButtonLogo = backButtonLogoImage.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        backButtonLogo = new ImageIcon(modifiedBackButtonLogo);




        ImageIcon exChangeLogo = new ImageIcon("razmjena.png");

        Image exChangeImage = exChangeLogo.getImage();
        Image modifiedExChangeLogo = exChangeImage.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        exChangeLogo = new ImageIcon(modifiedExChangeLogo);



        ImageIcon optButtonLogo = new ImageIcon("optionsLogo.png");

        Image optButtImage = optButtonLogo.getImage();
        Image modifiedOptLogo = optButtImage.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        optButtonLogo = new ImageIcon(modifiedOptLogo);


        ImageIcon wdLogo = new ImageIcon("withdrawLogo.png");

        Image wdImage = wdLogo.getImage();
        Image modifiedWdLogo = wdImage.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        wdLogo = new ImageIcon(modifiedWdLogo);


        ImageIcon depositLogo = new ImageIcon("depositLogo.png");

        Image depositImage = depositLogo.getImage();
        Image modifiedDepositLogo = depositImage.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        depositLogo = new ImageIcon(modifiedDepositLogo);
        //above is the scalling algorithm

        backButton = new JButton();
        backButton.setBounds(0,0,100,50);
        backButton.addActionListener(this);
        backButton.setIcon(backButtonLogo);
        backButton.setFocusable(false);


        exChangeButton = new JButton();
        exChangeButton.setBounds(200,250,100,50);
        exChangeButton.setFocusable(false);
        exChangeButton.setIcon(exChangeLogo);


        optionButton = new JButton();
        optionButton.setBounds(450,250,100,50);
        optionButton.setFocusable(false);
        optionButton.setIcon(optButtonLogo);

        wdButton = new JButton();
        wdButton.setBounds(450,150,100,50);
        wdButton.setFocusable(false);
        wdButton.setIcon(wdLogo);

        depButton = new JButton();
        depButton.setBounds(200,150,100,50);
        depButton.setIcon(depositLogo);
        depButton.setFocusable(false);
        depButton.addActionListener(this);

        ImageIcon logo = new ImageIcon("logo.png");
        titleLabel = new JLabel();
        titleLabel.setBounds(270,50,200,50);
        titleLabel.setIcon(logo);

        mainPanel = new JPanel();
        mainPanel.setBounds(0,0,750,500);
        mainPanel.setBackground(new Color(224, 231, 9));
        mainPanel.setLayout(null);
        mainPanel.add(titleLabel);
        mainPanel.add(depButton);
        mainPanel.add(wdButton);
        mainPanel.add(optionButton);
        mainPanel.add(exChangeButton);
        mainPanel.add(backButton);
        mainPanel.add(blackPanel);



        ImageIcon mainLogo = new ImageIcon("mainLogo.jpg");
        frame = new JFrame();
        frame.setIconImage(mainLogo.getImage());
        frame.setSize(750,500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(224, 231, 9));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Raiffaisen - Options Tab");
        frame.setResizable(false);
        frame.add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==depButton){

            frame.dispose();
            depositFrame depFrame = new depositFrame();
            depFrame.frame.setVisible(true);

        }
        else if(e.getSource()==wdButton){
            frame.dispose();


        }
        else if(e.getSource()==optionButton){
            frame.dispose();
        }
        else if(e.getSource()==exChangeButton){
            frame.dispose();
        }
        else if(e.getSource()==backButton){
            mainFrame mainFrame = new mainFrame();
            frame.dispose();
            mainFrame.frame.setVisible(true);
        }
    }
}
