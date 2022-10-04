package com.cognologix.operations;

import com.cognologix.entity.Student;
import com.cognologix.mapper.StudentMapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentOperations {
    private List<Student> studentList = new ArrayList<>();
    private String[] studentData;

    public StudentOperations(String[] studentData) {
        this.studentData = studentData;
    }
    public void createStudentList() {
        for(String student: studentData) {
            Student student1 = StudentMapper.getStudentMapped(student);
            this.studentList.add(student1);
        }
    }

    public void sortListByName() {

        Collections.sort(this.studentList, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getStudentName().compareTo(t1.getStudentName());
            }
        });
        this.studentList.stream().map(s -> s.getStudentName()).forEach(System.out::println);
    }

    public void sortListByIdInDescOrder() {
        Collections.sort(this.studentList, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return t1.getStudentId() - student.getStudentId();
            }
        });
        this.studentList.stream().map(student -> student).forEach(System.out::println);
    }

    public List<Student> filterListByCondition(int studentId) {
        List<Student> filteredList = new ArrayList<>();
        this.studentList.stream()
                .filter(student -> student.getStudentId() > studentId)
                .forEach(student -> filteredList.add(student));
        return filteredList;
    }

    public void printList(List<Student> list) {
        list.stream().map(student -> student).forEach(System.out::println);
    }

    public List<String> getStudentNamesLengthGrtrThan5() {
        List<String> list = new ArrayList<>();
        this.studentList.stream()
                .filter(student -> student.getStudentName().length() > 5)
                .forEach(student -> list.add(student.getStudentName()));
        return list;
    }
}
