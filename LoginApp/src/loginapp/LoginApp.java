/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author herrboh
 */

public class LoginApp implements ActionListener {

    private static JLabel label ;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("User");
        label.setBounds(10,20,80,25);
        panel.add(label);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);
        
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);    

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        button = new JButton("Enviar");
        button.setBounds(10,80,80,25);
        button.addActionListener(new LoginApp());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
        
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("Button Clicked");


        String user = userText.getText();
        char[] password = passwordText.getPassword();
        String passwordString = new String(password); //convirtiendo la variable vector char a String

        if(user.equals("Alex") && passwordString.equals("jaja")) {
            success.setText("Success");
        }
    }
    
}
