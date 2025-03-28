package com.jk.learnings.graphql.repository;

import com.jk.learnings.graphql.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {

}
