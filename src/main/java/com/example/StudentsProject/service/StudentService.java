package com.example.StudentsProject.service;


import com.example.StudentsProject.model.Student;
import com.example.StudentsProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student findById(Long id) {
        Student student1 = studentRepository.findById(id).orElseThrow();
        return student1;
    }
    public List<Student> findAll() {
       return studentRepository.findAll();

    }
    public Student saveUser(Student student) {
       return studentRepository.save(student);

    }
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }



}
