package com.convista.soe.service;

import com.convista.shared.model.PersonEntity;
import com.convista.soe.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class SoeService {
    PersonRepository personRepository;

    public List<PersonEntity> getGender(String gender) {
        return personRepository.findAllByGender(gender);
    }


}
