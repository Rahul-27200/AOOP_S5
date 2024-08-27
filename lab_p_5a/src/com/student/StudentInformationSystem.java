package com.student;

public class StudentInformationSystem {
    public static void main(String[] args) {
        // Create students
        IStudent student1 = new Student("Alice", 1);
        IStudent student2 = new Student("Bob", 2);

        // Create courses
        ICourse course1 = new Course("Mathematics", "MATH101");
        ICourse course2 = new Course("Physics", "PHYS101");

        // Create enrollment service
        IEnrollmentService enrollmentService = new EnrollmentService();

        // Enroll students in courses
        enrollmentService.enrollStudentInCourse(student1, course1);
        enrollmentService.enrollStudentInCourse(student1, course2);
        enrollmentService.enrollStudentInCourse(student2, course1);

        // Display enrolled courses for a student
        System.out.println("Courses enrolled by " + student1.getName() + ":");
        for (ICourse course : student1.getCourses()) {
            System.out.println(course.getCourseName());
        }

        // Display enrolled students in a course
        System.out.println("Students enrolled in " + course1.getCourseName() + ":");
        for (IStudent student : course1.getEnrolledStudents()) {
            System.out.println(student.getName());
        }
    }
}
