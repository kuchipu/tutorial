/*
 *
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here
package com.example.nxttrendz1.model;

import javax.persistence.*;

@Entity

@Table(name = "student")

public class Student {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "studentId")

    private int productId;

    @Column(name = "studentName")

    private String productName;

    public Student() {

    }

    public int getStudentId() {

        return studentId;

    }

    public void setStudentId(int studentId) {

        this.studentId = studentId;

    }

    public String getStudentName() {

        return studentName;

    }

    public void setStudentName(String studentName) {

        this.studentName = studentName;

    }

}