package com.innovastaj.kafkademo.services.concretes;


import com.innovastaj.kafkademo.constants.Constants;
import com.innovastaj.kafkademo.services.abstracts.KafkaConsumerService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerManager implements KafkaConsumerService {

    @Override
    @KafkaListener(topics = Constants.KAFKA_LOG_TOPIC, groupId = Constants.KAFKA_LOG_GROUP)
    public void listen(String message) {
        System.out.println("Mesaj geldi: " + message);
    }
}
