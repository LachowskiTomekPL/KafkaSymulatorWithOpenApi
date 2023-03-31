package com.convista.kafkaconsumerdatabase.service;

import com.convista.kafkaconsumerdatabase.repository.ConsumerDatabaseRepository;
import com.convista.shared.model.PersonDTO;
import com.convista.shared.model.PersonEntity;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Data

public class KafkaConsumerService {
    ConsumerDatabaseRepository consumerDatabaseRepository;

    public KafkaConsumerService(ConsumerDatabaseRepository consumerDatabaseRepository) {
        this.consumerDatabaseRepository = consumerDatabaseRepository;
    }

    @KafkaListener(topics = "kafka-topic2", groupId = "groupId")
    public void getPersonsFromKafka(ConsumerRecord<String, PersonDTO> record) {

        log.info("Printing person: " + record.value());
//        PersonMessage personMessage = new PersonMessage();
//        personMessage.setFirstName(record.value().getFirstName());
//        personMessage.setLastName(record.value().getLastName());
//        personMessage.setGender(record.value().getGender());
//        personMessage.setUuid(record.value().getUuid());
//        consumerDatabaseRepository.save(personMessage);
        //TODO Mapper
        PersonEntity personEntity = new PersonEntity();
        personEntity.setFirstName(record.value().getFirstName());
        personEntity.setLastName(record.value().getLastName());
        personEntity.setGender(record.value().getGender());
        personEntity.setUuid(record.value().getUuid());
        consumerDatabaseRepository.save(personEntity);

    }
}
