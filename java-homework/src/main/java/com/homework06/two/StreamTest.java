package com.homework06.two;

import com.homework06.two.entity.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {

    private static final List<Student> STUDENTS = create();

    private static final String CLAZZ1 = "软件1班";

    private static final String CLAZZ2 = "软件2班";

    private static List<Student> create() {

        Student s1 = new Student(2018008, "张扬", CLAZZ2, 66);

        Student s2 = new Student(2018005, "刘飞", CLAZZ1, 92);

        Student s3 = new Student(2018007, "李明", CLAZZ2, 42);

        Student s4 = new Student(2018006, "赵勇", CLAZZ2, 56);

        Student s5 = new Student(2018002, "王磊", CLAZZ1, 81);

        Student s6 = new Student(2018010, "牛娜", CLAZZ1, 78);

        List<Student> students = new ArrayList<>();

        students.add(s1);students.add(s2);students.add(s3);

        students.add(s4);students.add(s5);students.add(s6);

        return students;

    }



    public static void main(String[] args) {

        // 调用实现方法测试

    }

    //方法1，获取成绩小于等于指定分数，的全部学生
    public static List<Student> scoreGet(List<Student> students, int score) {
        return students.stream()
                .filter(s -> s.getScore() <= score)
                .toList();
    }

    //方法2，获取指定班级，成绩小于等于指定分数，的全部学生
    public static List<Student> clazzGet(List<Student> students, int score, String clazz) {
        return scoreGet(students, score).stream()
                .filter(s -> s.getClazz().equals(clazz))
                .toList();
    }

    //方法3，获取指定班级，成绩小于等于指定分数，的全部学生的姓名。
    public static List<String> nameGet(List<Student> students, int score, String clazz) {
        return clazzGet(students, score, clazz).stream()
                .map(Student::getName)
                .toList();
    }

    //方法4，按成绩由低到高排序，返回全部学生
    public static List<Student> sortScore(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparing(Student::getScore))
                .toList();
    }

    //方法5，获取指定班级，成绩小于等于指定分数，成绩由高到低排序，的全部学生
    public static List<Student> sortScore2(List<Student> students, int score, String clazz) {
        return clazzGet(students, score, clazz).stream()
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .toList();
    }

    //方法6，获取指定班级，成绩小于等于指定分数，成绩由高到低排序，的全部学生的学号。
    public static List<Integer> numberGet(List<Student> students, int score, String clazz) {
        return sortScore2(students, score, clazz).stream()
                .map(Student::getNumber)
                .toList();
    }

    //方法7，获取指定班级，成绩小于等于指定分数，的全部学生
    //以学生学号为键，学生分数为值，Map分组
    public static Map<Integer, Integer> studentMap(List<Student> students, int score, String clazz){
        return clazzGet(students, score, clazz).stream()
                .collect(Collectors.toMap(Student::getNumber, Student::getScore));
    }
}
