package com.test.simplerestapi.services;

import com.test.simplerestapi.exceptions.ResourceNotFoundException;
import com.test.simplerestapi.models.Person;
import com.test.simplerestapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private final int batch_size = 1000;

    @Autowired
    private PersonRepository personRepository;

    public Long savePerson(Person person) {
        personRepository.save(person);
        return person.getId();
    }

    public Long savePerson(Person person, Long id) {
        getPerson(id);
        person.setId(id);
        return savePerson(person);
    }

    public Person getPerson(Long id) {
        return personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Person not for the id: " + id));
    }

    public void deletePerson(Long id) {
        try {
            personRepository.deleteById(id);
        } catch (EmptyResultDataAccessException ex) {
           throw new ResourceNotFoundException("Person not for the id: " + id);
        }
    }
}



