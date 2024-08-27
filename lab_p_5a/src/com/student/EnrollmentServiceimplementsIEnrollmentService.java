package com.student;

 class EnrollmentService implements IEnrollmentService {
    @Override
    public void enrollStudentInCourse(IStudent student, ICourse course) {
        student.enrollInCourse(course);
    }
}
