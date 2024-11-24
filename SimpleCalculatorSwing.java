import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculatorSwing {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        // Create components
        JLabel num1Label = new JLabel("Enter first number:");
        JTextField num1Field = new JTextField();

        JLabel operatorLabel = new JLabel("Enter operator (+, -, *, /):");
        JTextField operatorField = new JTextField();

        JLabel num2Label = new JLabel("Enter second number:");
        JTextField num2Field = new JTextField();

        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        JButton calculateButton = new JButton("Calculate");
        JButton clearButton = new JButton("Clear");

        // Add components to the frame
        frame.add(num1Label);
        frame.add(num1Field);

        frame.add(operatorLabel);
        frame.add(operatorField);

        frame.add(num2Label);
        frame.add(num2Field);

        frame.add(resultLabel);
        frame.add(resultField);

        frame.add(calculateButton);
        frame.add(clearButton);

        // Action Listener for Calculate Button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse inputs
                    double num1 = Double.parseDouble(num1Field.getText());
                    String operator = operatorField.getText().trim();
                    double num2 = Double.parseDouble(num2Field.getText());

                    // Perform calculation
                    double result;
                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 == 0) {
                                throw new ArithmeticException("Division by zero is not allowed.");
                            }
                            result = num1 / num2;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid operator. Use +, -, *, or /.");
                    }

                    // Display result
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException | ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Action Listener for Clear Button
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1Field.setText("");
                operatorField.setText("");
                num2Field.setText("");
                resultField.setText("");
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
