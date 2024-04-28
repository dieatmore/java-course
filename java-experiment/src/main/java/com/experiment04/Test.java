package com.experiment04;

import com.experiment04.entity.Student;
import com.experiment04.resource.DatabaseUtils;
import com.experiment04.service.StudentService;
import com.experiment04.service.impl.StudentServiceImpl;

import java.util.List;
import java.util.Map;

public class Test {
    public static final StudentService studentService = new StudentServiceImpl();
    public static void main(String[] args){
        //addStudentTest();
        //listStudentsMapBySexTest();
        //listStudentsByYearMapByIdTest();
        //listStudentsByYearTest();
        //listStudentsNamesByYearBySexTest();
        //listStudentsByYearSortedByIdTest();
        //removeStudentTest();
    }

    private static void addStudentTest(){
        Student s = new Student(202222, Student.Sex.FEMALE,"赵天瑜",2014);
        List<Student> students = studentService.addStudent(s);
        students.forEach(student -> System.out.println(student.getName()));
    }
    private static void listStudentsByYearTest(){
        //int year = 2010;
        List<Student> students =  studentService.listStudentsByYear(2010);
        students.forEach(student -> System.out.println(student.getName()));
    }
    private static void listStudentsNamesByYearBySexTest(){
        int year = 2012;
        Student.Sex sex = Student.Sex.FEMALE;
        List<String> students =  studentService.listStudentsNames(year,sex);
        for(String i :students){
            System.out.println(i);
        }
    }
    private static void listStudentsByYearSortedByIdTest(){
        //int year = 2011;
        List<Student> students = studentService.listStudentsByYearSortedById(2012);
        students.forEach(student -> System.out.println(student.getName()));
    }
    private static void listStudentsMapBySexTest() {
        Map<Student.Sex, List<Student>> map = studentService.listStudentsMapBySex();
        map.forEach((sex, students) -> System.out.println(sex + "  " + students));
    }


    private static void listStudentsByYearMapByIdTest(){
        Map<Integer, Student> map =  studentService.listStudentsByYearMapById(2012);
        for(Map.Entry<Integer,Student> all:map.entrySet()){
            System.out.println(all.getKey() + " " + all.getValue().getName());
        }
    }

    private static void removeStudentTest(){
        System.out.println(studentService.removeStudent(201007));
        List<Student> students = DatabaseUtils.listStudents();
        students.forEach(student -> System.out.println(student.getId()));
    }
}
