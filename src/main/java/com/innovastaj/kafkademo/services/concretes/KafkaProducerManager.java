package com.innovastaj.kafkademo.services.concretes;


import com.innovastaj.kafkademo.constants.Constants;
import com.innovastaj.kafkademo.services.abstracts.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerManager  implements KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafkaProducerManager(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sendMessage(String message) {
        kafkaTemplate.send(Constants.KAFKA_LOG_TOPIC, message);
    }

}
