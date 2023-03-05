package com.convista.symulator.kafkaConfig;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public NewTopic myNewTopic(){
        return TopicBuilder.name("myOwnName")
                .partitions(4)
                .build();
    }



}
