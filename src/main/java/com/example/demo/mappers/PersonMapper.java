package com.example.demo.mappers;

import com.example.demo.dto.PersonDTO;
import com.example.demo.models.Person;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface PersonMapper {
    PersonDTO personToPersonDto(Person person);

    Person personDtoToPerson(PersonDTO personDTO);
}
