import java.util.Scanner;

public class SCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Calculator!");
        boolean continueCalculation = true;

        while (continueCalculation) {
            try {
                
                System.out.print("Enter the first number: ");
                double num1 = Double.parseDouble(scanner.nextLine());

                
                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = scanner.nextLine().charAt(0);


                System.out.print("Enter the second number: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                
                double result;
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            throw new ArithmeticException("Division by zero is not allowed.");
                        }
                        result = num1 / num2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator. Please use +, -, *, or /.");
                }

                
                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric values.");
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }


            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            continueCalculation = response.equals("yes");
        }

        System.out.println("Thank you for using the Simple Calculator.");
        scanner.close();
    }
}
