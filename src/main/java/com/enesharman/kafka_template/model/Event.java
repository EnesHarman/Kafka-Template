package com.enesharman.kafka_template.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event { //Dummy class
    private String code;
    private LocalDateTime ts;
}
