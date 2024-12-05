import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student\n2. Update Student\n3. Remove Student\n4. View Student\n5. View All Students\n6. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                scanner.nextLine(); 
                continue;
            }

            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age;
                    try {
                        age = scanner.nextInt();
                        scanner.nextLine(); 
                    } catch (Exception e) {
                        System.out.println("Invalid input for age. Please enter a valid number.");
                        scanner.nextLine(); 
                        continue;
                    }
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();
                    sms.addStudent(id, name, age, course);
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    id = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter New Age: ");
                    try {
                        age = scanner.nextInt();
                        scanner.nextLine(); 
                    } catch (Exception e) {
                        System.out.println("Invalid input for age. Please enter a valid number.");
                        scanner.nextLine(); 
                        continue;
                    }
                    System.out.print("Enter New Course: ");
                    course = scanner.nextLine();
                    sms.updateStudent(id, name, age, course);
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    id = scanner.nextLine();
                    sms.removeStudent(id);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    id = scanner.nextLine();
                    sms.viewStudent(id);
                    break;

                case 5:
                    sms.viewAllStudents();
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }
}

