package com.jamme.dev.filter_querying.repository;

import com.jamme.dev.filter_querying.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;


public interface CustomerRepo extends JpaRepository<Customer, Long>, QueryByExampleExecutor<Customer> {

}
