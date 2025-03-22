package com.jk.learnings.graphql.api;

import com.jk.learnings.graphql.entity.Customer;
import com.jk.learnings.graphql.repository.CustomerRepository;
import com.jk.learnings.graphql.services.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // GET all customers
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getCustomers();
    }

    // GET customer by ID
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable String id) {
        Optional<Customer> customer = customerService.getCustomerById(id);
        return ResponseEntity.ok(customer.orElse(null));
    }

    // CREATE a new customer
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        customer = customerService.createCustomer(customer);
        return customer;
    }

    // UPDATE customer
    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable String id, @RequestBody Customer updatedCustomer) {
        return customerService.getCustomerById(id)
                .map(existing -> {
                    existing.setName(updatedCustomer.getName());
                    existing.setFirstName(updatedCustomer.getFirstName());
                    existing.setLastName(updatedCustomer.getLastName());
                    existing.setEmail(updatedCustomer.getEmail());
                    existing.setPhone(updatedCustomer.getPhone());
                    existing.setMobilePhone(updatedCustomer.getMobilePhone());
                    existing.setContactPhone(updatedCustomer.getContactPhone());
                    existing.setComments(updatedCustomer.getComments());
                    existing.setCustomerType(updatedCustomer.getCustomerType());
                    return ResponseEntity.ok(customerService.createCustomer(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE customer
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable String id) {
        if (customerService.getCustomerById(id).isPresent()) {
            customerService.deleteCustomer(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
