package com.jk.learnings.graphql.services;

import com.jk.learnings.graphql.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Optional<Customer> getCustomerById(String id);
    List<Customer> getCustomers();
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    String deleteCustomer(String id);
}
