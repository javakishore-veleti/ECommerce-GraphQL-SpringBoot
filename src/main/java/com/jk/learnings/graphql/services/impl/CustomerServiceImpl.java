package com.jk.learnings.graphql.services.impl;

import com.jk.learnings.graphql.entity.Customer;
import com.jk.learnings.graphql.repository.CustomerRepository;
import com.jk.learnings.graphql.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Optional<Customer> getCustomerById(String id) {
        return Optional.of(customerRepository.getReferenceById(id));
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        customer = customerRepository.save(customer);
        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        customer = customerRepository.saveAndFlush(customer);
        return customer;
    }

    @Override
    public String deleteCustomer(String id) {
        customerRepository.deleteById(id);
        return "SUCCESS";
    }
}
