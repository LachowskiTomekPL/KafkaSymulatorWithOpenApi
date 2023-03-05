package com.convista.symulator.repository;

import com.convista.symulator.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {


    Optional<List<Person>> findByFirstNameAndLastName(Person firstName, Person lastName);

    Optional<Person> findByDateOfBirth(LocalDate localDate);




}
