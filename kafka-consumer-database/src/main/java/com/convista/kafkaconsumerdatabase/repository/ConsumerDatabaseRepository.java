package com.convista.kafkaconsumerdatabase.repository;

//import com.convista.kafkaconsumerdatabase.entity.Person;

import com.convista.kafkaconsumerdatabase.entity.PersonMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerDatabaseRepository extends JpaRepository<PersonMessage, Long> {

    public PersonMessage save(PersonMessage personMessage);


}
