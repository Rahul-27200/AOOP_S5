package com.student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Gradebook {
    private Set<Student> students;
    private Map<Student, Map<String, Integer>> studentGrades; // Student -> (Subject, Grade)

    public Gradebook() {
        students = new HashSet<>();
        studentGrades = new HashMap<>();
    }

    // Add a student to the gradebook
    public boolean addStudent(Student student) {
        return students.add(student);
    }

    // Assign or update a grade for a specific subject
    public void assignGrade(Student student, String subject, int grade) {
        if (!students.contains(student)) {
            throw new IllegalArgumentException("Student not found in the gradebook.");
        }

        // Retrieve or create the subject grades for the student
        Map<String, Integer> grades = studentGrades.getOrDefault(student, new HashMap<>());
        grades.put(subject, grade);

        studentGrades.put(student, grades);
    }

    // Retrieve a student's grade for a specific subject
    public Integer getGrade(Student student, String subject) {
        Map<String, Integer> grades = studentGrades.get(student);
        if (grades != null) {
            return grades.get(subject);
        }
        return null; // Return null if no grade is found
    }

    // Print all grades for a student
    public void printStudentGrades(Student student) {
        if (studentGrades.containsKey(student)) {
            System.out.println("Grades for " + student.getName() + ": " + studentGrades.get(student));
        } else {
            System.out.println(student.getName() + " has no grades recorded.");
        }
    }

    // Print all students
    public void printAllStudents() {
        System.out.println("All Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
