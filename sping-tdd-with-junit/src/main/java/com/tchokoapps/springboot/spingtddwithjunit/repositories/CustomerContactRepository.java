package com.tchokoapps.springboot.spingtddwithjunit.repositories;

import com.tchokoapps.springboot.spingtddwithjunit.models.CustomerContact;
import org.springframework.data.repository.CrudRepository;

public interface CustomerContactRepository extends CrudRepository<CustomerContact, Long> {
}
