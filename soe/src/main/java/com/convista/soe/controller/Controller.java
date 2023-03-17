package com.convista.soe.controller;

import com.convista.soe.FindByGenderApi;
import com.convista.soe.Gender;
import com.convista.soe.Person;
import com.convista.soe.service.SoeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller implements FindByGenderApi {
    SoeService soeService;

    @Override
    public ResponseEntity<Person> getGenderById(String gender) {

        Person person = new Person();
        person.setFirstName("Jan");
        person.setLastname("Kowalski");
        person.setUuid("34343443");
        person.setGender(Gender.FEMALE);

        return ResponseEntity.ok(person);
//        return ResponseEntity.ok(soeService.getGender(person));

    }
}
