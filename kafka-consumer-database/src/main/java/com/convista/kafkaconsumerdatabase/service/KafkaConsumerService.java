package com.convista.kafkaconsumerdatabase.service;

import com.convista.kafkaconsumerdatabase.entity.PersonMessage;
import com.convista.kafkaconsumerdatabase.repository.ConsumerDatabaseRepository;
import com.convista.shared.model.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Data
@AllArgsConstructor
public class KafkaConsumerService {
    ConsumerDatabaseRepository consumerDatabaseRepository;


    @KafkaListener(topics = "kafka-topic2", groupId = "groupId")
    public void getPersonsFromKafka(ConsumerRecord<String, Person> record) {

        log.info("Printing person: " + record.value());
        PersonMessage personMessage = new PersonMessage();
        personMessage.setFirstName(record.value().getFirstName());
        personMessage.setLastName(record.value().getLastName());
        personMessage.setGender(record.value().getGender());
        personMessage.setUuid(record.value().getUuid());
        consumerDatabaseRepository.save(personMessage);

    }
}
