package com.jk.learnings.graphql.services.impl;

import com.jk.learnings.graphql.entity.Customer;
import com.jk.learnings.graphql.repository.CustomerRepository;
import com.jk.learnings.graphql.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Optional<Customer> getCustomerById(String id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> getCustomers() {
        Iterable<Customer> customers = customerRepository.findAll();
        List<Customer> customersList = new ArrayList<>();
        customers.forEach(customersList::add);
        return customersList;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        customer = customerRepository.save(customer);
        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        customer = customerRepository.save(customer);
        return customer;
    }

    @Override
    public String deleteCustomer(String id) {
        customerRepository.deleteById(id);
        return "SUCCESS";
    }
}
