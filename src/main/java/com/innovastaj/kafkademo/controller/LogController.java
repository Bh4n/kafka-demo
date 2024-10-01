package com.innovastaj.kafkademo.controller;


import com.innovastaj.kafkademo.services.concretes.KafkaProducerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private final KafkaProducerManager kafkaProducerManager;

    @Autowired
    public LogController(KafkaProducerManager kafkaProducerManager) {
        this.kafkaProducerManager = kafkaProducerManager;
    }

    @RequestMapping(value = "/send")
    public String sendMessage(@RequestParam("message") String message) {
        kafkaProducerManager.sendMessage(message);
        return "Message sent to Kafka: " + message;
    }
}
