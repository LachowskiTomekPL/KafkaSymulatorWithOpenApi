package com.convista.soe.service;

import com.convista.shared.model.PersonEntity;
import com.convista.soe.Gender;
import com.convista.soe.PersonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonMapperService {

    public List<PersonResponse> mapToPersonResponse(List<PersonEntity> personEntityList) {
        List<PersonResponse> personResponseList = new ArrayList<>();

        for (PersonEntity personEntity : personEntityList) {
            personResponseList.add(mapEntity(personEntity));
        }
        return personResponseList;
    }

    private PersonResponse mapEntity(PersonEntity personEntity) {
        PersonResponse personResponse = new PersonResponse();
        personResponse.setFirstName(personEntity.getFirstName());
        personResponse.setFirstName(personEntity.getLastName());
        personResponse.setUuid(personEntity.getUuid().toString());
        personResponse.setGender(Gender.valueOf(personEntity.getGender().toString()));

        return personResponse;
    }

}
