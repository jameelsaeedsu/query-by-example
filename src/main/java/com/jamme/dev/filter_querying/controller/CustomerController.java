package com.jamme.dev.filter_querying.controller;

import com.jamme.dev.filter_querying.model.Customer;
import com.jamme.dev.filter_querying.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = CustomerController.CUSTOMERS_PATH)
public class CustomerController {

    public static final String CUSTOMERS_PATH = "/api/v1/customers";

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/search/customer")
    public List<Customer> findByExample(@RequestBody @Valid Customer customer) {
        return customerService.findCustomersByExample(customer);
    }
}
