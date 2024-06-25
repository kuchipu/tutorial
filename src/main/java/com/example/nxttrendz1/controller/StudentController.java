/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here review,product
package com.example.nxttrendz1.controller;

import com.example.nxttrendz1.model.Student;

import com.example.nxttrendz1.service.StudentJpaService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

public class StudentController {

    @Autowired

    private StudentJpaService studentJpaService;

    @GetMapping("/students")

    public ArrayList<Student> getStudents() {

        return studentJpaService.getStudents();

    }

    @GetMapping("/students/{studentId}")

    public Student getStudentById(@PathVariable("studentId") int studentId) {

        return studentJpaService.getStudentById(studentId);

    }

    @PostMapping("/students")

    public Student addStudent(@RequestBody Student student) {

        return studentJpaService.addStudent(student);

    }

}