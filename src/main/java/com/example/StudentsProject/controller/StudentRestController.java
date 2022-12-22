package com.example.StudentsProject.controller;

import com.example.StudentsProject.model.Student;
import com.example.StudentsProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable("id") Long id) {
        Student student = studentService.findById(id);
        return student;
    }

}
