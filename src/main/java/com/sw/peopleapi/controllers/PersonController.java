package com.sw.peopleapi.controllers;

import com.sw.peopleapi.entities.Person;
import com.sw.peopleapi.services.impl.PersonSerivceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/peoples")
@AllArgsConstructor( onConstructor = @__(@Autowired))
public class PersonController {

    private final PersonSerivceImpl personSerivce;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person create(Person person) {
        return personSerivce.createPerson(person);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Person findById(@PathVariable Long id) {
        return personSerivce.findById(id);
    }

    @GetMapping
    public List<Person> listAll() {
        return personSerivce.listAll();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Person update(@PathVariable Long id, Person person) {
        return personSerivce.updatePersn(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        personSerivce.deletePerson(id);
    }

}
