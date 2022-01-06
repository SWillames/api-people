package com.sw.peopleapi.services;

import com.sw.peopleapi.dto.request.PersonDTO;
import com.sw.peopleapi.dto.response.MessageResponseDTO;
import com.sw.peopleapi.entities.Person;
import com.sw.peopleapi.exception.PersonNotFoundException;

import java.util.List;

public interface PersonService {
    public MessageResponseDTO createPerson(PersonDTO personDTO);
    public PersonDTO findById(Long id) throws PersonNotFoundException;
    public List<PersonDTO> listAll();
    public MessageResponseDTO updatePerson(Long id, PersonDTO personDTO) throws PersonNotFoundException;
    public void deletePerson(Long id) throws PersonNotFoundException;
}
