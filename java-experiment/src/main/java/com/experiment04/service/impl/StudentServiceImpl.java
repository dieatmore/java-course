package com.experiment04.service.impl;

import com.experiment04.entity.Student;
import com.experiment04.resource.DatabaseUtils;
import com.experiment04.service.StudentService;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Iterator;

public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> addStudent(Student student) {
        DatabaseUtils.listStudents().add(student);
        return DatabaseUtils.listStudents();
    }

    @Override
    public List<Student> listStudentsByYear(int year) {
        return DatabaseUtils.listStudents()
                .stream()
                .filter(y -> y.getYear() == year)
                .toList();
    }

    @Override
    public List<String> listStudentsNames(int year, Student.Sex sex) {
        return DatabaseUtils.listStudents()
                .stream()
                .filter(y -> y.getYear() == year)
                .filter(s -> s.getSex() == sex)
                .map(s -> s.getName())
                .toList();
    }

    @Override
    public List<Student> listStudentsByYearSortedById(int year) {
        return DatabaseUtils.listStudents()
                .stream()
                .filter(y -> y.getYear() == year)
                .sorted(Comparator.comparing(Student::getId).reversed())
                .toList();
    }

    @Override
    public Map<Student.Sex, List<Student>> listStudentsMapBySex() {
        return DatabaseUtils.listStudents()
                .stream()
                .collect(Collectors.groupingBy(s -> s.getSex()));
    }

    @Override
    public Map<Integer, Student> listStudentsByYearMapById(int year) {
        return DatabaseUtils.listStudents()
                .stream()
                .filter(y -> y.getYear() == year)
                .collect(Collectors.toMap(s -> s.getId(), s -> s));
    }

    @Override
    public boolean removeStudent(int id) {
        Iterator<Student> studentIterator = DatabaseUtils.listStudents().iterator();
        boolean b = false;
        while (studentIterator.hasNext()){
            Student student = studentIterator.next();
            if(id == student.getId()){
                studentIterator.remove();
                b = true;
            }
        }
        return b;
    }
}
