package com.convista.kafkaconsumerdatabase.service;

import com.convista.kafkaconsumerdatabase.entity.Person;
import com.convista.kafkaconsumerdatabase.entity.PersonMessage;
import com.convista.kafkaconsumerdatabase.repository.ConsumerDatabaseRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Data
public class KafkaConsumerService {
    ConsumerDatabaseRepository consumerDatabaseRepository;
    PersonMessage personMessage = new PersonMessage();

    @KafkaListener(topics = "kafka-topic2", groupId = "groupId")
    public void getPersonsFromKafka(Person person) {

        log.info("Printing person: " + person.getFirstName() + person.getLastName());
        personMessage.setFirstName(person.getFirstName());
        personMessage.setLastName(person.getLastName());
        personMessage.setUuid(person.getUuid());
        consumerDatabaseRepository.save(personMessage);

    }
}
