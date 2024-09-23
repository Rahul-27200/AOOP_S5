package com.student;

public class Main {
    public static void main(String[] args) {
        Gradebook gradebook = new Gradebook();
        
        // Create students
        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");

        // Add students to gradebook
        gradebook.addStudent(student1);
        gradebook.addStudent(student2);

        // Assign grades
        gradebook.assignGrade(student1, "Math", 90);
        gradebook.assignGrade(student1, "Science", 85);
        gradebook.assignGrade(student2, "Math", 88);

        // Retrieve and print grades
        gradebook.printStudentGrades(student1);
        gradebook.printStudentGrades(student2);

        // Print all students
        gradebook.printAllStudents();
    }
}
