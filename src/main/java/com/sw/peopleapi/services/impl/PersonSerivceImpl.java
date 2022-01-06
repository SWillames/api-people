package com.sw.peopleapi.services.impl;

import com.sw.peopleapi.dto.mapper.PersonMapper;
import com.sw.peopleapi.dto.request.PersonDTO;
import com.sw.peopleapi.dto.response.MessageResponseDTO;
import com.sw.peopleapi.entities.Person;
import com.sw.peopleapi.exception.PersonNotFoundException;
import com.sw.peopleapi.repositories.PersonRepository;
import com.sw.peopleapi.services.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonSerivceImpl implements PersonService {

    private PersonRepository personRepository;

    private final PersonMapper mapper;

    @Override
    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person person = mapper.toModel(personDTO);
        Person personSaved = personRepository.save(person);

        MessageResponseDTO responseDTO = createMessageResponse("Person successfully created with ID, ", personSaved.getId());
        return responseDTO;
    }

    @Override
    public PersonDTO findById(Long id) throws PersonNotFoundException {
        Person person = personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));

        return mapper.toDto(person);
    }

    @Override
    public List<PersonDTO> listAll() {
        List<Person> people = personRepository.findAll();
        return people.stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public MessageResponseDTO updatePerson(Long id, PersonDTO  personDTO) throws PersonNotFoundException{
        personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));

        Person updatedPerson = mapper.toModel(personDTO);
        Person savedPerson = personRepository.save(updatedPerson);

        MessageResponseDTO responseDTO = createMessageResponse("Person successfuly updated with ID ", savedPerson.getId());

        return responseDTO;
    }

    @Override
    public void deletePerson(Long id) throws PersonNotFoundException{
        personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
        personRepository.deleteById(id);
    }

    private MessageResponseDTO createMessageResponse(String s, Long id) {
        return MessageResponseDTO.builder()
                .message(s + id)
                .build();
    }
}
