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

    @KafkaListener(topics = "kafka-topic2", groupId = "any")
    public void getPersonsFromKafka(Person message) {
        log.info("Printing person: " + message.getFirstName() + message.getLastName());
        personMessage.setFirstName(message.getFirstName());
        personMessage.setLastName(message.getLastName());
        personMessage.setUuid(message.getUuid());
        consumerDatabaseRepository.save(personMessage);

    }
}
