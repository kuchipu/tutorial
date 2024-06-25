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

@Table(name = "address")

public class Address {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "addressid")

    private int addressId;

    @Column(name = "addressarea")

    private String addressArea;

    @ManyToOne

    @JoinColumn(name = "Studentid")

    private Student student;

    public Address() {

    }

    public int getAddressId() {

        return addressId;

    }

    public void setAddressId(int addressId) {

        this.addressId = addressId;

    }

    public String getAddressContent() {

        return addressContent;

    }

    public void setAddressArea(String addressArea) {

        this.addressArea = addressArea;

    }

    public Student getStudent() {

        return student;

    }

    public void setStudent(Student student) {

        this.student = student;

    }
}