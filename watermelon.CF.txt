import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        // Create a JFrame for the GUI
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create a JTextField to display the result
        JTextField resultField = new JTextField();
        resultField.setBounds(50, 50, 300, 50);
        frame.add(resultField);

        // Create buttons for numbers and operations
        JButton addButton = new JButton("+");
        addButton.setBounds(50, 150, 50, 50);
        frame.add(addButton);

        JButton subButton = new JButton("-");
        subButton.setBounds(150, 150, 50, 50);
        frame.add(subButton);

        JButton mulButton = new JButton("*");
        mulButton.setBounds(250, 150, 50, 50);
        frame.add(mulButton);

        JButton divButton = new JButton("/");
        divButton.setBounds(350, 150, 50, 50);
        frame.add(divButton);

        // Action listeners for buttons
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation(resultField, "+");
            }
        });

        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation(resultField, "-");
            }
        });

        mulButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation(resultField, "*");
            }
        });

        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation(resultField, "/");
            }
        });

        // Display the frame
        frame.setVisible(true);

        // Console-based input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter operation (+, -, *, /):");
        String operation = scanner.next();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        double result = 0;
        switch (operation) {
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Result: " + result);
        resultField.setText(String.valueOf(result));
    }

    private static void performOperation(JTextField resultField, String operation) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        double result = 0;
        switch (operation) {
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Result: " + result);
        resultField.setText(String.valueOf(result));
    }
}
