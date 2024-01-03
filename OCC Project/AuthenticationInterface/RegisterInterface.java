package AuthenticationInterface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterInterface extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private LoginInterface loginInterface;

    public RegisterInterface(LoginInterface loginInterface) {
        this.loginInterface = loginInterface;

        setTitle("Register");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(52, 73, 94));
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

        JButton registerButton = new JButton("Register");
        registerButton.setBackground(Color.BLACK);
        registerButton.setForeground(Color.BLACK);
        registerButton.setBounds(150, 120, 100, 30);
        panel.add(registerButton);

        // Add action listener for the Register button
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Check if username or password is empty
                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Username and password are required.", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Stop further processing
                }

                // Call your register method here with username and password
                // Example: Register.registerUser(username, password);

                JOptionPane.showMessageDialog(null, "User registered successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

                // Close the registration window
                dispose();

                // Open the LoginInterface for user verification
                loginInterface.setUsernameToVerify(username);
                loginInterface.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Example: new RegisterInterface(new LoginInterface());
            }
        });
    }
}

