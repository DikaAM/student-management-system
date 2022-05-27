package com.portofolio.studentmanagementsystem.controller;

import com.portofolio.studentmanagementsystem.services.StudentServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class StudentController {
    private StudentServices studentServices;

    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("student", studentServices.getAllStudents());
        return "students";
    }



}
