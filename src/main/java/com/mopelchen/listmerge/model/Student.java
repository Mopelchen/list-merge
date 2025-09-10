package com.mopelchen.listmerge.model;

public class Student extends Person {

    private final String studentId;

    public Student(String firstName, String lastName, String studentId) {
        super(firstName, lastName);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

}
