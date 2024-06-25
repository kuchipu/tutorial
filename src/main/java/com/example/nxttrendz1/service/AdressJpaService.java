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

package com.example.nxttrendz1.service;

import com.example.nxttrendz1.model.Address;

import com.example.nxttrendz1.model.Student;

import com.example.nxttrendz1.repository.StudentJpaRepository;

import com.example.nxttrendz1.repository.AddressJpaRepository;

import com.example.nxttrendz1.repository.AddressRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.stereotype.Service;

import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

import java.util.List;

@Service

public class AddressJpaService implements AddressRepository {

    @Autowired

    private AddressJpaRepository addressJpaRepository;

    @Autowired

    private StudentJpaRepository studentJpaRepository;

    public ArrayList<Address> getAddresss() {

        List<Address> addresssList = addressJpaRepository.findAll();

        ArrayList<Address> addresss = new ArrayList<>(addresssList);

        return addresss;

    }

    public Address getAddressById(int addressId) {

        try {

            Address address = addressJpaRepository.findById(addressId).get();

            return address;

        } catch (Exception e) {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        }

    }

    public Address addAddress(Address address) {

        Student student = address.getStudent();

        int studentId = student.getStudentId();

        try {

            Student = studentJpaRepository.findById(studentId).get();

            address.setStudent(student);

            addressJpaRepository.save(address);

            return address;

        } catch (Exception e) {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        }

    }

    public Student getAddressStudent(int addressId) {

        try {

            Address address = addressJpaRepository.findById(addressId).get();

            Student student = address.getStudent();

            return student;

        } catch (Exception e) {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        }

    }

}