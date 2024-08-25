package com.enesharman.kafka_template.service;

import com.enesharman.kafka_template.model.Event;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    private final String EVENT_TOPIC = "tpc_event";
    private final String CONSUMER_GROUP = "grp_event";

    @KafkaListener(topics = EVENT_TOPIC, groupId = CONSUMER_GROUP, concurrency = "20")
    public void listen(Event event) {
        System.out.println(event);
    }
}
