package com.jamme.dev.filter_querying.service;

import com.jamme.dev.filter_querying.model.Customer;

import java.util.List;

public interface CustomerService {

    void createCustomers(List<Customer> customer);

    List<Customer> findCustomersByExample(Customer customer);

}
