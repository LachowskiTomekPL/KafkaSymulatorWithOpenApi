package com.convista.soe.service;

import com.convista.shared.model.Gender;
import com.convista.shared.model.PersonEntity;
import com.convista.soe.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class PersonService {
    PersonRepository personRepository;

    public List<PersonEntity> getAllByGender(Gender gender) {
        return personRepository.findAllByGender(gender);
    }


}
