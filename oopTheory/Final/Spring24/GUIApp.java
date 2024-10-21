import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIApp implements ActionListener {
    // Declaring label, text field and button
    JLabel outputLabel;
    JTextField inputField;
    JButton performButton;
    
    // Initialize the output number
    int outputNumber = 10;
    
    // Constructor to set up the GUI
    public GUIApp() {
        // Create a frame
        JFrame frame = new JFrame("Simple Calculator");
        
        // Create the label, text field, and button
        outputLabel = new JLabel("Output: " + outputNumber);
        inputField = new JTextField(10);  // TextField to input operator and number
        performButton = new JButton("Perform");
        
        // Add action listener to the button
        performButton.addActionListener(this);
        
        // Set up the layout
        frame.setLayout(new FlowLayout());
        
        // Add components to the frame
        frame.add(outputLabel);
        frame.add(inputField);
        frame.add(performButton);
        
        // Set frame properties
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Implementing the actionPerformed method
    @Override
    public void actionPerformed(ActionEvent e) {
        // Get input from text field
        String input = inputField.getText();
        String[] parts = input.split(" ");
        
        // Ensure the input contains both an operator and a number
        if (parts.length == 2) {
            String operator = parts[0];
            try {
                int number = Integer.parseInt(parts[1]);
                
                // Perform the operation based on the operator
                switch (operator) {
                    case "+":
                        outputNumber += number;
                        break;
                    case "-":
                        outputNumber -= number;
                        break;
                    case "*":
                        outputNumber *= number;
                        break;
                    case "/":
                        if (number != 0) {
                            outputNumber /= number;
                        } else {
                            JOptionPane.showMessageDialog(null, "Cannot divide by zero");
                            return;
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid operator");
                        return;
                }
                
                // Update the output label
                outputLabel.setText("Output: " + outputNumber);
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid number format");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter an operator and a number");
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        new GUIApp();
    }
}
