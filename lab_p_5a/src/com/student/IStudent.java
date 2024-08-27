package com.student;

public interface IStudent {
    String getName();
    int getID();
    void enrollInCourse(ICourse course);
    List<ICourse> getCourses();
}
