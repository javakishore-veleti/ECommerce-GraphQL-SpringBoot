package com.jk.learnings.graphql.services;

import com.jk.learnings.graphql.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    public Optional<Customer> getCustomerById(String id);
    public List<Customer> getCustomers();
    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public String deleteCustomer(String id);
}
