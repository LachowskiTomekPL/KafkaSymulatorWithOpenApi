package com.convista.symulator.controller;

import com.convista.symulator.entity.Person;
import com.convista.symulator.service.KafkaService;
import com.convista.symulator.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;
    private final KafkaService kafkaService;


    @PostMapping("/saveperson")
    public ResponseEntity<Person> addPerson(@RequestBody Person person) {
        System.out.println("wysyła");
        kafkaService.sendPersonToKafka(UUID.randomUUID().toString(), person);
        personService.savePerson(person);
        return ResponseEntity.ok(person);
    }


}
