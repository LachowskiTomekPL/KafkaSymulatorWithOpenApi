package com.convista.symulator.controller;

import com.convista.shared.model.Person;
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
    public ResponseEntity<Person> addPerson(@RequestBody Person person) {

        kafkaService.sendPersonToKafka(person);


        return ResponseEntity.ok(person);

    }

}

