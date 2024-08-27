package com.student;

import java.util.ArrayList;
import java.util.List;

public class Student implements IStudent {
    private String name;
    private int id;
    private List<ICourse> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public void enrollInCourse(ICourse course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public List<ICourse> getCourses() {
        return courses;
    }
}
