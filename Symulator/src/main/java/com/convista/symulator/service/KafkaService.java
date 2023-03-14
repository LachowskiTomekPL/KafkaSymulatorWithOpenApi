package com.convista.symulator.service;

import com.convista.shared.model.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
/*
@Data
*/
@RequiredArgsConstructor
public class KafkaService {


    private final KafkaTemplate<String, Person> kafkaTemplate;
    @Value("${spring.kafka.topic.name}")
    private String topicName;

    public void sendPersonToKafka(Person message) {
        log.info("Sending archive message with id {} to kafka topic" + message);
        kafkaTemplate.send(topicName, message);


    }


}
