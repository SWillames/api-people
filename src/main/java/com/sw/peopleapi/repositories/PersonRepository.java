package com.sw.peopleapi.repositories;

import com.sw.peopleapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
