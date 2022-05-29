package com.portofolio.studentmanagementsystem.service.impl;

import com.portofolio.studentmanagementsystem.entity.Student;
import com.portofolio.studentmanagementsystem.repository.StundentRepository;
import com.portofolio.studentmanagementsystem.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentServices {
    @Autowired
    private StundentRepository stundentRepository;
    public StudentServiceImpl(StundentRepository stundentRepository) {
        this.stundentRepository = stundentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return stundentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return stundentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return stundentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return stundentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        stundentRepository.deleteById(id);
    }
}
