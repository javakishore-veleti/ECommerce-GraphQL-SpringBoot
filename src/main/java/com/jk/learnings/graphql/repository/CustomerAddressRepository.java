package com.jk.learnings.graphql.repository;

import com.jk.learnings.graphql.entity.CustomerAddress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerAddressRepository extends CrudRepository<CustomerAddress, String> {

}
