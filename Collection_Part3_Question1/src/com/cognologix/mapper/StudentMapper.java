package com.cognologix.mapper;

import com.cognologix.entity.Student;

public class StudentMapper {
    public static Student getStudentMapped(String student) {
        try {
            String[] studentArray = student.split(", ");
            Integer studentId = Integer.parseInt(studentArray[0]);
            String studentName = studentArray[1];

            Student student1 = new Student(studentId, studentName);
            return student1;
        } catch (NumberFormatException numberFormatException) {
            throw new RuntimeException(numberFormatException);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
