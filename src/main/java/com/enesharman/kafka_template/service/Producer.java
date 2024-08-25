package com.enesharman.kafka_template.service;

import com.enesharman.kafka_template.model.Event;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private final String EVENT_TOPIC = "tpc_event";
    private final KafkaTemplate<String, Event> producer;

    public Producer(KafkaTemplate<String, Event> producer) {
        this.producer = producer;
    }

    public void fireEvent(Event event) {
        producer.send(EVENT_TOPIC, event);
    }
}
