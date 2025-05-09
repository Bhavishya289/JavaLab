import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginForm extends JFrame implements ActionListener {

    // Swing components
    private Container container;
    private JLabel userLabel, passLabel, messageLabel;
    private JTextField userTextField;
    private JPasswordField passField;
    private JButton loginButton;

    public LoginForm() {
        setTitle("Login Form");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        // Username label
        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 30, 80, 30);
        container.add(userLabel);

        // Username text field
        userTextField = new JTextField();
        userTextField.setBounds(140, 30, 150, 30);
        container.add(userTextField);

        // Password label
        passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 70, 80, 30);
        container.add(passLabel);

        // Password field
        passField = new JPasswordField();
        passField.setBounds(140, 70, 150, 30);
        container.add(passField);

        // Login button
        loginButton = new JButton("Login");
        loginButton.setBounds(120, 110, 100, 30);
        loginButton.addActionListener(this);
        container.add(loginButton);

        // Message label
        messageLabel = new JLabel("");
        messageLabel.setBounds(50, 140, 250, 30);
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(messageLabel);

        setVisible(true);
    }

    // Action performed on login button click
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userTextField.getText();
        String password = String.valueOf(passField.getPassword());

        if (username.equals("admin") && password.equals("password")) {
            messageLabel.setText("Login successfull!");
            messageLabel.setForeground(Color.GREEN);
        } else {
            messageLabel.setText("Invalid credentials.");
            messageLabel.setForeground(Color.RED);
        }
    }

    // Main method to run the app
    public static void main(String[] args) {
        new LoginForm();
    }
}
