import java.util.HashMap;

public class StudentManagementSystem {
    private HashMap<String, Student> students = new HashMap<>();

    public void addStudent(String id, String name, int age, String course) {
        if (students.containsKey(id)) {
            System.out.println("Student ID already exists.");
        } else {
            students.put(id, new Student(id, name, age, course));
            System.out.println("Student added.");
        }
    }

    public void updateStudent(String id, String name, int age, String course) {
        if (students.containsKey(id)) {
            Student student = students.get(id);
            student.setName(name);
            student.setAge(age);
            student.setCourse(course);
            System.out.println("Student updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void removeStudent(String id) {
        if (students.remove(id) != null) {
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void viewStudent(String id) {
        Student student = students.get(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            students.values().forEach(System.out::println);
        }
    }
}
