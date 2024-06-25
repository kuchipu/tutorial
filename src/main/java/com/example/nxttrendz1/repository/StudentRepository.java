/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxttrendz1.repository;

import com.example.nxttrendz1.model.Student;

import java.util.ArrayList;

public interface StudentRepository {

    ArrayList<Student> getStudents();

    Student getStudenById(int studentId);

    Student addStudent(Student student);

}