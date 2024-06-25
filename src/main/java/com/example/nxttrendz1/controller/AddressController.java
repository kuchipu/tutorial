/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here 
package com.example.nxttrendz1.controller;

import com.example.nxttrendz1.model.Address;

import com.example.nxttrendz1.model.Student;

import com.example.nxttrendz1.service.AddressJpaService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

public class AddressController {

    @Autowired

    private AddressJpaService addressJpaService;

    @GetMapping("/students/addresss")

    public ArrayList<Address> getAddresss() {

        return addressJpaService.getAddresss();

    }

    @GetMapping("/students/addresss/{addressId}")

    public Address getAddressById(@PathVariable("addressId") int addressId) {

        return addressJpaService.getAddressById(addressId);

    }

    @PostMapping("/students/addresss")

    public Address addAddress(@RequestBody Address address) {

        return addressJpaService.addAddress(address);

    }

    @GetMapping("/addresss/{addressId}/student")

    public Student getAddressStudent(@PathVariable int addressId) {

        return addressJpaService.getAddressStudent(addressId);

    }

}