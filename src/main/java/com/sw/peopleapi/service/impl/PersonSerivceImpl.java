package com.sw.peopleapi.service.impl;

import com.sw.peopleapi.entities.Person;
import com.sw.peopleapi.repositories.PersonRepository;
import com.sw.peopleapi.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonSerivceImpl implements PersonService {

    private PersonRepository personRepository;

    @Override
    public Person createPerson(Person person) {
        Person personSaved = personRepository.save(person);
        return personSaved;
    }

    @Override
    public Person findById(Long id) {
        return null;
    }

    @Override
    public List<Person> listAll() {
        return null;
    }

    @Override
    public Person updatePersn(Long id) {
        return null;
    }

    @Override
    public void deletePerson(Long id) {

    }
}