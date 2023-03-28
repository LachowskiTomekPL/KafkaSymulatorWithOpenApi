package com.convista.soe.repository;

import com.convista.shared.model.PersonEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends ListCrudRepository<PersonEntity, Long> {


    List<PersonEntity> findAllByGender(String gender);
}
