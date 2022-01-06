package com.sw.peopleapi.dto.mapper;

import com.sw.peopleapi.dto.request.PersonDTO;
import com.sw.peopleapi.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDto(Person dto);
}
