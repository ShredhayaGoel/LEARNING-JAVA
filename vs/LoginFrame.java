package vs;
    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Login Form");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create username label and text field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(100, 20, 200, 25);
        frame.add(userText);

        // Create password label and field
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 60, 80, 25);
        frame.add(passLabel);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(100, 60, 200, 25);
        frame.add(passText);

        // Create login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(120, 100, 100, 30);
        frame.add(loginButton);

        // Action listener for button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passText.getPassword());

                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid credentials");
                }
            }
        });

        // Show frame
        frame.setVisible(true);
    }
}
