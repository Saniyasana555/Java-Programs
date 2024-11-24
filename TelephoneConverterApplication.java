import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelephoneConverterApplication {
    private static final double RATE_PER_CALL = 0.10; // Rate per call in dollars

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Telephone Conversion Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 150);

        // Initialize components
        JTextField callCountField = new JTextField(10);
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);  // Result field should not be editable
        JButton convertButton = new JButton("Convert to Cost");

        // Add components to the frame
        frame.add(new JLabel("Enter Number of Calls:"));
        frame.add(callCountField);
        frame.add(convertButton);
        frame.add(new JLabel("Total Cost ($):"));
        frame.add(resultField);

        // Add action listener to the convert button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int callCount = Integer.parseInt(callCountField.getText());
                    double totalCost = callCount * RATE_PER_CALL;
                    resultField.setText(String.format("%.2f", totalCost));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
