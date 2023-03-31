package com.convista.soe.repository;

import com.convista.shared.model.Gender;
import com.convista.shared.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {


    List<PersonEntity> findAllByGender(Gender gender);
}
