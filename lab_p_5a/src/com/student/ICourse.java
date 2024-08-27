package com.student;

public interface ICourse {
    String getCourseName();
    String getCourseID();
    void addStudent(IStudent student);
    List<IStudent> getEnrolledStudents();
}
