package com.convista.symulator.controller;

import com.convista.symulator.entity.Person;
import com.convista.symulator.service.KafkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final KafkaService kafkaService;


    @PostMapping("/persons")
    public ResponseEntity<String> addPerson(@RequestBody Person person) {
        Person personEntity = new Person();
        kafkaService.sendPersonToKafka(person.getFirstName());


        return ResponseEntity.ok(person.getFirstName());

    }

}

