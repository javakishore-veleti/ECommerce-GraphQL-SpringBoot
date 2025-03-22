package com.jk.learnings.graphql.repository;

import com.jk.learnings.graphql.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    // You can add custom queries here if needed
    // Example: List<Customer> findByEmail(String email);
}
