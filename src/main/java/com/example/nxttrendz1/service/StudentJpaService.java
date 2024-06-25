/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here 
package com.example.nxttrendz1.service;

import com.example.nxttrendz1.model.Student;

import com.example.nxttrendz1.repository.StudentJpaRepository;

import com.example.nxttrendz1.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.stereotype.Service;

import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

import java.util.List;

@Service

public class StudentJpaService implements StudentRepository {

    @Autowired

    private StudentJpaRepository studentJpaRepository;

    @Override

    public ArrayList<Student> getStudents() {

        List<Student> studentList = studentJpaRepository.findAll();

        ArrayList<Student> students = new ArrayList<>(studentList);

        return students;

    }

    @Override

    public Student getStudentById(int studentId) {

        try {

            Student student = studentJpaRepository.findById(studentId).get();

            return student;

        } catch (Exception e) {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        }

    }

    @Override

    public Student addStudent(Student student) {

        studentJpaRepository.save(student);

        return student;

    }
}