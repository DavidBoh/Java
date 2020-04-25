import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JLabel userLabel = new JLabel("Usuario: ");
    private static JLabel passwordLabel = new JLabel("Password: ");
    private static JPasswordField passwordText = new JPasswordField();
    private static JTextField userText = new JTextField();
    private static JButton button = new JButton("Ingresar");
    private static JLabel success;

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);


        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);


        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);


        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);


        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);


        button.setBounds(80, 90, 120, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);


        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //TODO Auto Generated method stub
        String user = userText.getText();
        String password = passwordText.getText();


        if (user.equals("Dave") && password.equals("sart")) {
            success.setText("Login successful!");
        }
    }

}
