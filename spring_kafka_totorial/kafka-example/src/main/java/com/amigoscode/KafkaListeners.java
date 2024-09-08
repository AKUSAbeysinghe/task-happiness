package com.amigoscode;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "amigoscode", groupId = "groupId")
    void listener(String data){

        //windows+. for emojis

        System.out.println("Listener received "+data+ "🎁");
    }



}
