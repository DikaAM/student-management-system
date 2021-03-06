package com.portofolio.studentmanagementsystem.services;

import com.portofolio.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentServices  {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);

}
