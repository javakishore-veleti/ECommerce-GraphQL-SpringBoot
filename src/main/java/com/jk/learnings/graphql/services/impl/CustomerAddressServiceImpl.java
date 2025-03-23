package com.jk.learnings.graphql.services.impl;

import com.jk.learnings.graphql.entity.CustomerAddress;
import com.jk.learnings.graphql.repository.CustomerAddressRepository;
import com.jk.learnings.graphql.services.CustomerAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerAddressServiceImpl implements CustomerAddressService {

    @Autowired
    private CustomerAddressRepository customerAddressRepository;


    @Override
    public Optional<CustomerAddress> getCustomerAddressById(String customerId, String id) {
        return customerAddressRepository.findById(id);
    }

    @Override
    public List<CustomerAddress> geCustomerAddresses(String customerId) {
        Iterable<CustomerAddress> customers = customerAddressRepository.findAll();
        List<CustomerAddress> customerAddresses = new ArrayList<>();
        customers.forEach(customerAddresses::add);
        return customerAddresses;
    }

    @Override
    public CustomerAddress createCustomerAddress(String customerId, CustomerAddress customerAddress) {
        customerAddress = customerAddressRepository.save(customerAddress);
        return customerAddress;
    }

    @Override
    public CustomerAddress updateCustomerAddress(String customerId,CustomerAddress customerAddress) {
        customerAddress = customerAddressRepository.save(customerAddress);
        return customerAddress;
    }

    @Override
    public String deleteCustomerAddress(String customerId,String id) {
        customerAddressRepository.deleteById(id);
        return "SUCCESS";
    }
}
