package com.tchokoapps.springboot.spingtddwithjunit.services;

import com.tchokoapps.springboot.spingtddwithjunit.models.CustomerContact;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class CustomerContactServiceIT {

    public static final String FIRST_NAME = "Patrick";
    public static final String LAST_NAME = "Tchokonte";

    @Autowired
    private CustomerContactService underTest;

    @Before
    public void setUp() {

    }

    @Test
    public void add_shouldRetrieveCorrectValue() {

        //Arrange
        CustomerContact customerContact = new CustomerContact();
        customerContact.setFirstName(FIRST_NAME);
        customerContact.setLastName(LAST_NAME);

        // Act
        CustomerContact contact = underTest.add(customerContact);

        // Assert
        assertThat(contact.getFirstName()).isEqualTo(FIRST_NAME);
        assertThat(contact.getLastName()).isEqualTo(LAST_NAME);
        assertThat(contact.getId()).isNotNull();
    }

}