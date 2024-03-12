package Task_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OnlineSurveySystem {
    // Import necessary libraries

        // Constructor
        public OnlineSurveySystem() {
            // Initialize GUI components
            JFrame frame = new JFrame("Online Survey System");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            placeComponents(panel);

            // Display the frame
            frame.setVisible(true);
        }

        // Method to place GUI components
        private void placeComponents(JPanel panel) {
            panel.setLayout(null);

            // Username label and text field
            JLabel userLabel = new JLabel("Username:");
            userLabel.setBounds(10, 20, 80, 25);
            panel.add(userLabel);

            JTextField userText = new JTextField(20);
            userText.setBounds(100, 20, 165, 25);
            panel.add(userText);

            // Password label and password field
            JLabel passwordLabel = new JLabel("Password:");
            passwordLabel.setBounds(10, 50, 80, 25);
            panel.add(passwordLabel);

            JPasswordField passwordText = new JPasswordField(20);
            passwordText.setBounds(100, 50, 165, 25);
            panel.add(passwordText);

            // Login button
            JButton loginButton = new JButton("Login");
            loginButton.setBounds(10, 80, 80, 25);
            panel.add(loginButton);

            // Action listener for login button
            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String username = userText.getText();
                    String password = new String(passwordText.getPassword());
                    // Here you can implement authentication logic
                    // For simplicity, let's just display a message
                    JOptionPane.showMessageDialog(panel, "Logged in as: " + username);
                }
            });
        }

        // Main method to start the application
        public static void main(String[] args) {
            new OnlineSurveySystem();
        }
    }


