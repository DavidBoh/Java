/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author herrboh
 */

public class LoginApp implements ActionListener {

    private static JLabel label;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    
    

    public static void main(final String[] args) {

        final JPanel panel = new JPanel();
        final JFrame frame = new JFrame();
        frame.setSize(750,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        
        panel.setLayout(null);
        
        label = new JLabel("Usuario");
        label.setBounds(610,10,80,25);
        panel.add(label);

        userText = new JTextField(20);
        userText.setBounds(560,40,165,25);
        panel.add(userText);
        
        passwordLabel = new JLabel("Contraseña");
        passwordLabel.setBounds(600,60,120,25);
        panel.add(passwordLabel);    

        passwordText = new JPasswordField("********");
        passwordText.setBounds(560,85,165,25);
        panel.add(passwordText);
        passwordText.setEnabled(false);

        button = new JButton("Enviar");
        button.setBounds(600,120,80,25);
        button.addActionListener(new LoginApp());
        panel.add(button);

        

        frame.setVisible(true);
        
    }

   
    @Override
    public void actionPerformed(final ActionEvent e) {
        System.out.println("Button Clicked");

        PreparedStatement st;
        ResultSet rs;

        final String username = userText.getText();
        final String password = String.valueOf(passwordText.getPassword());

        final String query = "SELECT * FROM `usuarios` WHERE `username` = ? AND `password` = ?";

        try {
            
            st = login_connection.getConnection().prepareStatement(query);

            st.setString(1, username);
            st.setString(2, password);

            rs = st.executeQuery();
            /* *************************
            String user = userText.getText();
            char[] passwordx = passwordText.getPassword();
            String passwordString = new String(passwordx); //convirtiendo la variable vector char a String

            if(user.equals("test") && passwordString.equals("123")) {
            success.setText("Success");
            }
            */ 
            if(rs.next())
            {
                //success ex = new success();
                System.out.println("conexion exitosa");
                new success();
                //ex.setVisible(true);
                //ex.pack();
                //ex.setLocationRelativeTo(null);
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña invalidos","Error login",2);
            }

        } catch (final SQLException ex){
            Logger.getLogger(LoginApp.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }

    
    
}