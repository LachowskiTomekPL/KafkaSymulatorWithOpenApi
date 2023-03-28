package com.convista.kafkaconsumerdatabase.repository;

//import com.convista.kafkaconsumerdatabase.entity.PersonDTO;

import com.convista.shared.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerDatabaseRepository extends JpaRepository<PersonEntity, Long> {


}
