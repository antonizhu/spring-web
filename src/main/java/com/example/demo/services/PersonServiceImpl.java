package com.example.demo.services;

import com.example.demo.models.Person;
import com.example.demo.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    public PersonServiceImpl(@Autowired PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person addPerson(Person person){
        log.debug("adding person "+person.toString());
        return personRepository.save(person);
    }
}
