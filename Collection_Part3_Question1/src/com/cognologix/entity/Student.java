package com.cognologix.entity;

import java.util.Comparator;

public class Student {
    private Integer studentId;
    private String studentName;

    public Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("StudentId: {0} | StudentName: {1} {2}", studentId, studentName, System.lineSeparator());
    }
}
