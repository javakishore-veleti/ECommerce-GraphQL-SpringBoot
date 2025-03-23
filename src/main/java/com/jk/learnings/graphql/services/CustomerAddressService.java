package com.jk.learnings.graphql.services;

import com.jk.learnings.graphql.entity.CustomerAddress;

import java.util.List;
import java.util.Optional;

public interface CustomerAddressService {
    Optional<CustomerAddress> getCustomerAddressById(String customerId, String id);
    List<CustomerAddress> geCustomerAddresses(String customerId);
    CustomerAddress createCustomerAddress(String customerId, CustomerAddress customerAddress);
    CustomerAddress updateCustomerAddress(String customerId, CustomerAddress customerAddress);
    String deleteCustomerAddress(String customerId, String id);
}
