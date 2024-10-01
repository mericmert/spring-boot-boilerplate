package com.mericbulca.springbootboilerplate.service.impl;

import com.mericbulca.springbootboilerplate.domain.Customer;
import com.mericbulca.springbootboilerplate.repository.CustomerRepository;
import com.mericbulca.springbootboilerplate.service.CustomerService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerById(UUID id) {
        return customerRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }
}
