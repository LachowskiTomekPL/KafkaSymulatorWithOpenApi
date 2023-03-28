package com.convista.kafkaconsumerdatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.convista.shared.model"})
public class KafkaConsumerDatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerDatabaseApplication.class, args);
    }

}
