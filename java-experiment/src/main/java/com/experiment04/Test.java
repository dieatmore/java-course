package com.experiment04;

import com.experiment04.entity.Student;
import com.experiment04.service.StudentService;
import com.experiment04.service.impl.StudentServiceImpl;

import java.util.function.Predicate;

public class Test {
    public static StudentService studentService = new StudentServiceImpl();

    public static void main(String[] args) {
        //addStudentTest();
        //listStudentsByYearTest();
        //listStudentsNamesTest();
        //listStudentsByYearSortedByIdTest();
        //listStudentsMapBySexTest();
        //listStudentsByYearMapByIdTest();
        //removeStudentTest();
    }

    private static void addStudentTest(){
        Student s = new Student(201301, Student.Sex.FEMALE, "赵天瑜", 2013);
        studentService.addStudent(s);
    }

    private static void listStudentsByYearTest(){
        studentService.listStudentsByYear(2011);
    }

    private static void listStudentsNamesTest(){
        studentService.listStudentsNames(2013, Student.Sex.FEMALE);
    }

    private static void listStudentsByYearSortedByIdTest(){
        studentService.listStudentsByYearSortedById(2011);
    }

    private static void listStudentsMapBySexTest(){
        studentService.listStudentsMapBySex();
    }

    private static void listStudentsByYearMapByIdTest(){
        studentService.listStudentsByYearMapById(2010);
    }

    private static void removeStudentTest(){
        studentService.removeStudent(201301);
    }
}
