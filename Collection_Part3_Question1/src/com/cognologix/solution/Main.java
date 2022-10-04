package com.cognologix.solution;

import com.cognologix.operations.StudentOperations;
import com.cognologix.entity.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] studentsInformation = {
                "22, Rajesh",
                "23, Dinesh",
                "22, Aboli",
                "26, Mayuresh",
                "25, Sarika",
                "24, Ketaki"
        };

        // 1. create a list of students
        StudentOperations studentOperations = new StudentOperations(studentsInformation);
        studentOperations.createStudentList();
        // 2. Sort the list by name
        System.out.println("Sorted student list by student name");
        studentOperations.sortListByName();

        // 3. Sort list by id in descending order
        System.out.println("Sorted student list by student id in descending order");
        studentOperations.sortListByIdInDescOrder();

        // 4. filter the list of students for studentId > 23
        System.out.println("Filtered Student List for student Id > 23");
        List<Student> filteredList = studentOperations.filterListByCondition(23);
        studentOperations.printList(filteredList);

        // 5. get student names of length > 5
        List<String> studentNames  = studentOperations.getStudentNamesLengthGrtrThan5();
        System.out.println("Student names of length greater than 5: " + studentNames);
    }
}