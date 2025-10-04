/*
 * File: StudentManagementSystem.java
 * Description: A complete student management system with CRUD operations and file persistence.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement a complete CRUD (Create, Read, Update, Delete) application
 * - Use object-oriented programming concepts (classes, objects, encapsulation)
 * - Implement file-based data persistence using Java serialization
 * - Create a menu-driven console application
 * - Handle user input with Scanner in a continuous loop
 * - Implement exception handling for file operations
 * - Use Collections (ArrayList) to manage data
 * 
 * System features:
 * - Add new students with unique IDs
 * - Display all students in the system
 * - Search for specific students by ID
 * - Update existing student information
 * - Delete students from the system
 * - Save and load data to/from files
 */
import java.io.*;
import java.util.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Added for serialization
    private String id;
    private String name;
    private int age;
    private String course;
    private double grade;

    // Constructor
    public Student(String id, String name, int age, String course, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age +
               ", Course: " + course + ", Grade: " + grade;
    }
}

class StudentManager {
    private List<Student> students = new ArrayList<>();

    // Add a new student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // Search for a student by ID
    public Student searchStudent(String id) {
        for (Student student : students) {
            if (student.getId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }

    // Update student details
    public void updateStudent(String id, String name, int age, String course, double grade) {
        Student student = searchStudent(id);
        if (student != null) {
            student.setName(name);
            student.setAge(age);
            student.setCourse(course);
            student.setGrade(grade);
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Delete a student
    public void deleteStudent(String id) {
        Student student = searchStudent(id);
        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Save data to a file
    public void saveToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // Load data from a file
    @SuppressWarnings("unchecked")
    public void loadFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            students = (List<Student>) ois.readObject();
            System.out.println("Data loaded from file.");
        } catch (FileNotFoundException e) {
            System.out.println("No data file found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        String fileName = "students.dat";
        manager.loadFromFile(fileName);

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Save to File");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    double grade = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    manager.addStudent(new Student(id, name, age, course, grade));
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    id = scanner.nextLine();
                    Student student = manager.searchStudent(id);
                    if (student != null) {
                        System.out.println(student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to update: ");
                    id = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter New Age: ");
                    age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter New Course: ");
                    course = scanner.nextLine();
                    System.out.print("Enter New Grade: ");
                    grade = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    manager.updateStudent(id, name, age, course, grade);
                    break;

                case 5:
                    System.out.print("Enter Student ID to delete: ");
                    id = scanner.nextLine();
                    manager.deleteStudent(id);
                    break;

                case 6:
                    manager.saveToFile(fileName);
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    manager.saveToFile(fileName);
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
// A complete student management system: From basic concepts to a full application!
// Fun fact: This project combines many Java concepts learned throughout your course!
