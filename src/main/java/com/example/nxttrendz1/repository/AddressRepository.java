/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxttrendz1.repository;

import com.example.nxttrendz1.model.*;

import java.util.ArrayList;

public interface AddressRepository {

    ArrayList<Address> getAddresss();

    Address getAddressById(int addressId);

    Address addAddress(Address address);

    Student getAddressStudent(int AddressId);

}