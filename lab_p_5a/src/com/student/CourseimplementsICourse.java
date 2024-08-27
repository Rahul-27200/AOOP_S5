package com.student;

import java.util.ArrayList;
import java.util.List;

public class Course implements ICourse {
    private String courseName;
    private String courseID;
    private List<IStudent> enrolledStudents;

    public Course(String courseName, String courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.enrolledStudents = new ArrayList<>();
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String getCourseID() {
        return courseID;
    }

    @Override
    public void addStudent(IStudent student) {
        enrolledStudents.add(student);
    }

    @Override
    public List<IStudent> getEnrolledStudents() {
        return enrolledStudents;
    }
}
