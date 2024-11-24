import java.util.ArrayList;
import java.util.Scanner;

class Account {
    private String accountHolder;
    private double balance;

    
    public Account(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

   
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }
}

public class BankingApp {
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    
    public static void createAccount() {
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
        Account account = new Account(name);
        accounts.add(account);
        System.out.println("Account created successfully for " + name);
    }

    // Method to find an account by account holder's name
    public static Account findAccount(String name) {
        for (Account account : accounts) {
            if (account.getAccountHolder().equalsIgnoreCase(name)) {
                return account;
            }
        }
        return null;
    }

    // Display the menu
    public static void displayMenu() {
        System.out.println("\n--- Banking Application ---");
        System.out.println("1. Create an Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    createAccount();
                    break;

                case 2:
                    System.out.print("Enter account holder's name: ");
                    String depositName = scanner.nextLine();
                    Account depositAccount = findAccount(depositName);
                    if (depositAccount != null) {
                        System.out.print("Enter amount to deposit : ");
                        double depositAmount = scanner.nextDouble();
                        depositAccount.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter account holder's name: ");
                    String withdrawName = scanner.nextLine();
                    Account withdrawAccount = findAccount(withdrawName);
                    if (withdrawAccount != null) {
                        System.out.print("Enter amount to withdraw : ");
                        double withdrawAmount = scanner.nextDouble();
                        withdrawAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter account holder's name: ");
                    String balanceName = scanner.nextLine();
                    Account balanceAccount = findAccount(balanceName);
                    if (balanceAccount != null) {
                        System.out.println("Balance for " + balanceAccount.getAccountHolder() + ":" + balanceAccount.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the application!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
