package com.triad.credirisk.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CreditRiskService {

    @KafkaListener(topics = "creditrisk", groupId = "traid-group1")
    public void consumeCreditRiskMessages(String message) {

    }
}
