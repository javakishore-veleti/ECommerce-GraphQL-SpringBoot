package com.jk.learnings.graphql.services.resolvers.impl;

import com.jk.learnings.graphql.queires.dtos.CustomerResponse;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Service;

@SuppressWarnings("ALL")
@Service
public class CustomerRespResolver implements GraphQLResolver<CustomerResponse> {

    public String getId(CustomerResponse customerResponse) {
        return customerResponse.getId();
    }

    public String getName(CustomerResponse customerResponse) {
        return customerResponse.getName();
    }

    public String getCustomerType(CustomerResponse customerResponse) {
        return customerResponse.getCustomerType();
    }

    public String getFirstName(CustomerResponse customerResponse) {
        return customerResponse.getFirstName();
    }

    public String getLastName(CustomerResponse customerResponse) {
        return customerResponse.getLastName();
    }

    public String getEmail(CustomerResponse customerResponse) {
        return customerResponse.getEmail();
    }

    public String getPhone(CustomerResponse customerResponse) {
        return customerResponse.getPhone();
    }

    public String getMobilePhone(CustomerResponse customerResponse) {
        return customerResponse.getMobilePhone();
    }

    public String getContactPhone(CustomerResponse customerResponse) {
        return customerResponse.getContactPhone();
    }

    public String getComments(CustomerResponse customerResponse) {
        return customerResponse.getComments();
    }

    // Add any other methods you need to resolve fields in CustomerResponse
}

