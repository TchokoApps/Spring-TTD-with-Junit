package com.tchokoapps.springboot.spingtddwithjunit.services;

import com.tchokoapps.springboot.spingtddwithjunit.models.CustomerContact;
import com.tchokoapps.springboot.spingtddwithjunit.repositories.CustomerContactRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerContactService {

    private final CustomerContactRepository customerContactRepository;

    public CustomerContactService(CustomerContactRepository customerContactRepository) {
        this.customerContactRepository = customerContactRepository;
    }

    public CustomerContact add(CustomerContact customerContact) {
        return customerContactRepository.save(customerContact);
    }


}
