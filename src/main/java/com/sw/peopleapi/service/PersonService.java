package com.sw.peopleapi.service;

import com.sw.peopleapi.entities.Person;

import java.util.List;

public interface PersonService {
    public Person createPerson(Person person);
    public Person findById(Long id);
    public List<Person> listAll();
    public Person updatePersn(Long id);
    public void deletePerson(Long id);
}
