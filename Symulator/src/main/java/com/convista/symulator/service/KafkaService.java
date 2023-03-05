package com.convista.symulator.service;

import com.convista.symulator.entity.Person;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Data
public class KafkaService {


    final KafkaTemplate<String, String> kafkaTemplate;

    public void sendPersonToKafka(String key, Person message) {
        log.info("Sending archive message with id {} to kafka topic", key);
        kafkaTemplate.send("AnotherOne", key, message.toString());
    }
}
