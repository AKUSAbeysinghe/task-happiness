package com.amigoscode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {

        SpringApplication.run(KafkaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
        return args->{
            //kafkaTemplate.send("amigoscode", "hello kafka :)");
           //.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties <-----start Zoookeper
           //.\bin\windows\kafka-server-start.bat .\config\server.properties    <--- start kafka


            // write this in cmd----->   .\bin\windows\kafka-console-producer.bat --topic amigoscode --bootstrap-server localhost:9092
//.\bin\windows\kafka-console-consumer.bat --topic amigoscode --from-beginning --bootstrap-server localhost:9092

//        for(int i=0; i< 10_000; i++){
//            kafkaTemplate.send("amigoscode", "hello kafka :)"+i);
//        }



            for(int i=0; i< 100; i++){
                kafkaTemplate.send("amigoscode", "hello kafka :)"+i);
            }
        };
    }

}
