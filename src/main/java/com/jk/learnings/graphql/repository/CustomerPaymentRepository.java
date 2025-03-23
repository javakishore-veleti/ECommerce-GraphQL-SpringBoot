package com.jk.learnings.graphql.repository;

import com.jk.learnings.graphql.entity.CustomerPayment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerPaymentRepository extends CrudRepository<CustomerPayment, String> {

}
