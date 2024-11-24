import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumberApplication {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Reverse Number");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 150);

        // Initialize components
        JTextField inputField = new JTextField(10);
        JButton reverseButton = new JButton("Reverse");
        JTextField resultField = new JTextField(10);

        // Set the result field to be non-editable
        resultField.setEditable(false);

        // Add components to the frame
        frame.add(new JLabel("Enter Number:"));
        frame.add(inputField);
        frame.add(reverseButton);
        frame.add(new JLabel("Reversed Number:"));
        frame.add(resultField);

        // Add action listener to the button
        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the text from the input field
                String inputText = inputField.getText();
                // Reverse the text
                String reversedText = new StringBuilder(inputText).reverse().toString();
                // Set the reversed text in the result field
                resultField.setText(reversedText);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
