package com.tchokoapps.springboot.spingtddwithjunit.services;

import com.tchokoapps.springboot.spingtddwithjunit.models.CustomerContact;
import com.tchokoapps.springboot.spingtddwithjunit.repositories.CustomerContactRepository;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class CustomerContactServiceTest {

    @Mock
    CustomerContactRepository customerContactRepository;

    @InjectMocks
    private CustomerContactService customerContactService;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void add() {
        // Arrange
        CustomerContact contact = new CustomerContact();
        contact.setFirstName("Nadine");
        contact.setLastName("Atanga");
        when(customerContactRepository.save(any(CustomerContact.class))).thenReturn(contact);

        // Act
        CustomerContact addedContact = customerContactService.add(contact);

        // Assert
        Assertions.assertThat(addedContact.getFirstName()).isNotNull();
    }
}
