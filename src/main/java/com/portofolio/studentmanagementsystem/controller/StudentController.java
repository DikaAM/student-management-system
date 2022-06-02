package com.portofolio.studentmanagementsystem.controller;

import com.portofolio.studentmanagementsystem.entity.Student;
import com.portofolio.studentmanagementsystem.services.StudentServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@Controller
public class StudentController {
    private StudentServices studentServices;

    // Method to get all students
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("student", studentServices.getAllStudents());
        return "students";
    }

    // Method to create new student
    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        Student student = new Student();
        model.addAttribute("murid", student);
        return "create_student";
    }

    // Method to save new student
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentServices.saveStudent(student);
        return "redirect:/students";
    }

    // Method to view student
    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student", studentServices.getStudentById(id));
        return "edit_student";
    }

    // Method to update and save student
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id
                , @ModelAttribute("student") Student student
                ){
        //Get Student From Database by Id
        Student existingStudent = studentServices.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        //Save Updated Student
        studentServices.updateStudent(existingStudent);
        return "redirect:/students";

    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentServices.deleteStudentById(id);
        return "redirect:/students";
    }

    @GetMapping("/students/view/{id}")
    public String viewStudent(@PathVariable Long id, Model model){
        model.addAttribute("student", studentServices.getStudentById(id));
        return "view_student";
    }

}
