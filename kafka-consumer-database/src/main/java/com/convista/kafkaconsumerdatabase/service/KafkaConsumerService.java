package com.convista.kafkaconsumerdatabase.service;

import com.convista.kafkaconsumerdatabase.entity.PersonMessage;
import com.convista.kafkaconsumerdatabase.repository.ConsumerDatabaseRepository;
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
    PersonMessage personMessage = new PersonMessage();

    @KafkaListener(topics = "kafka-topic2", groupId = "groupId", containerFactory = "kafkaListenerContainerFactory")
    public void getPersonsFromKafka(ConsumerRecord<String, String> record) {

        log.info("Printing person: " + record.value());
//        personMessage.setFirstName(record.value());
////        personMessage.setLastName(record.value());
////        personMessage.setUuid(record.value());
//        consumerDatabaseRepository.save(personMessage);

    }
}
