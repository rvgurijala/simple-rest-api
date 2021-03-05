package com.test.simplerestapi.controllers;
import com.test.simplerestapi.models.Person;
import com.test.simplerestapi.services.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/v1")
public class PersonController {

    @Autowired
    private PersonService personService;
    Logger logger = LoggerFactory.getLogger(PersonController.class);

    @PostMapping(path = "/persons", produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    public Long createPerson(@Valid @RequestBody Person person) {
        return personService.savePerson(person);
    }

    @PutMapping(path = "/persons/{id}", produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public Long updatePerson(@Valid @RequestBody Person person, @PathVariable Long id) {
        return personService.savePerson(person, id);
    }

    @GetMapping(path = "/persons/{id}", produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public Person getPerson(@PathVariable Long id) {
        return personService.getPerson(id);
    }

    @DeleteMapping(path = "/persons/{id}", produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public void deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
    }

}
