package com.example.demo.services;

import com.example.demo.models.Person;
import com.example.demo.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class PersonServiceImplTest {

    PersonServiceImpl personService;

    @Mock
    PersonRepository personRepository;

    @BeforeEach
    void init(){
        MockitoAnnotations.initMocks(this);

        personService = new PersonServiceImpl(personRepository);
    }

    @Test
    void addPerson() {
        Person person = new Person();
        person.setAge(20);
        person.setFirstName("Antoni");
        person.setLastName("Zhu");

        Person newPerson = new Person();
        person.setAge(21);
        person.setFirstName("Zhu");
        person.setLastName("Antoni");
        person.setId(1);
        when(personRepository.save(any(Person.class))).thenReturn(newPerson);
        Person addedPerson = personService.addPerson(person);
        verify(personRepository, times(1)).save(any(Person.class));
        log.debug(addedPerson.toString());

    }
}