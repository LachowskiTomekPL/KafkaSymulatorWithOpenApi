package com.convista.soe.service;

import com.convista.soe.Person;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SoeService {
    public Person getGender(Person person) {
        return Optional.ofNullable(person.gender(person.getGender()))
                .orElseThrow();
    }
}
