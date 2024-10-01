package com.mericbulca.springbootboilerplate.service;

import com.mericbulca.springbootboilerplate.domain.Customer;

import java.util.UUID;

public interface CustomerService {

    Customer findCustomerById(UUID id);

}
