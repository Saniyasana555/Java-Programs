import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WeightConverterApplication {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Weight Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 200);

        // Initialize components
        JTextField inputField = new JTextField(10);
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);  // Result field should not be editable

        JRadioButton toKgButton = new JRadioButton("g to kg");
        JRadioButton toGrButton = new JRadioButton("kg to g");

        // Group the radio buttons to allow only one selection
        ButtonGroup group = new ButtonGroup();
        group.add(toKgButton);
        group.add(toGrButton);

        // Default selection
        toKgButton.setSelected(true);

        JButton convertButton = new JButton("Convert");

        // Add components to the frame
        frame.add(new JLabel("Enter weight:"));
        frame.add(inputField);
        frame.add(toKgButton);
        frame.add(toGrButton);
        frame.add(convertButton);
        frame.add(new JLabel("Converted weight:"));
        frame.add(resultField);

        // Add action listener to the convert button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputWeight = Double.parseDouble(inputField.getText());

                    if (toKgButton.isSelected()) {
                        // Convert grams to kilograms
                        double result = inputWeight / 1000.0;
                        resultField.setText(String.format("%.3f kg", result));
                    } else if (toGrButton.isSelected()) {
                        // Convert kilograms to grams
                        double result = inputWeight * 1000.0;
                        resultField.setText(String.format("%.1f g", result));
                    }
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
