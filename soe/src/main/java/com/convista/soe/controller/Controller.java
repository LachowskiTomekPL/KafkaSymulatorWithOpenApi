package com.convista.soe.controller;

import com.convista.shared.model.Gender;
import com.convista.shared.model.PersonEntity;
import com.convista.soe.FindByGenderApi;
import com.convista.soe.PersonResponse;
import com.convista.soe.service.MapperService;
import com.convista.soe.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Controller implements FindByGenderApi {
    PersonService personService;
    MapperService mapperService;


    public ResponseEntity<List<PersonResponse>> getGenderById(String gender) {

        List<PersonEntity> allByGender = personService.getAllByGender(Gender.valueOf(gender.toUpperCase()));
        return ResponseEntity.ok(mapperService.mapToPersonResponse(allByGender));


    }
}
