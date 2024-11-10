package com.jamme.dev.filter_querying.service.impl;

import com.jamme.dev.filter_querying.model.Customer;
import com.jamme.dev.filter_querying.repository.CustomerRepo;
import com.jamme.dev.filter_querying.service.CustomerService;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public void createCustomers(List<Customer> customer) {
        customerRepo.saveAll(customer);
    }

    public List<Customer> findCustomersByExample(Customer customer) {
        Example<Customer> customerExample = Example.of(customer);
        return customerRepo.findAll(customerExample);
    }
}
