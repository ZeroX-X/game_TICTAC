package AuthenticationInterface; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginInterface extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private String usernameToVerify; // To store the username for verification

    public LoginInterface() {
        setTitle("Login");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(44, 62, 80));
        placeComponents(panel);
        add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setForeground(Color.WHITE);
        userLabel.setBounds(50, 40, 80, 25);
        panel.add(userLabel);

        usernameField = new JTextField(20);
        usernameField.setBounds(150, 40, 200, 25);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(50, 80, 80, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(150, 80, 200, 25);
        panel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.BLACK);
        loginButton.setBounds(150, 120, 100, 30);
        panel.add(loginButton);

        JButton registerButton = new JButton("Register");
        registerButton.setBackground(Color.BLACK);
        registerButton.setForeground(Color.BLACK);
        registerButton.setBounds(260, 120, 100, 30);
        panel.add(registerButton);

        // Add action listeners
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = usernameField.getText();
                String enteredPassword = new String(passwordField.getPassword());

                // Check if the entered username matches the one to verify
                if (enteredUsername.equals(usernameToVerify)) {
                    // Check your login logic here with enteredUsername and enteredPassword
                    boolean loginResult = true;  // Replace with actual login logic

                    if (loginResult) {
                        JOptionPane.showMessageDialog(null, "Login successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Login failed. Incorrect credentials.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username. Please register first.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the RegisterInterface when the Register button is clicked
                dispose(); // Close the current login window
                new RegisterInterface(LoginInterface.this); // Pass the reference to LoginInterface
            }
        });
    }

    // Method to set the username for verification
    public void setUsernameToVerify(String username) {
        this.usernameToVerify = username;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginInterface();
            }
        });
    }
}
