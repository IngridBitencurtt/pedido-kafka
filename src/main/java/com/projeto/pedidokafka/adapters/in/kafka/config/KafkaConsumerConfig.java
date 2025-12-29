package com.projeto.pedidokafka.adapters.in.kafka.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.listener.DefaultErrorHandler;
import org.springframework.util.backoff.FixedBackOff;

import java.util.function.BiConsumer;

@Configuration
public class KafkaConsumerConfig {

    @Bean
    public DefaultErrorHandler errorHandler(KafkaTemplate<String, String> kafkaTemplate) {

        BiConsumer<ConsumerRecord<String, String>, Exception> recoverer =
                (record, exception) ->
                        kafkaTemplate.send(
                                "pedidos-dlq",
                                record.key(),
                                record.value()
                        );

        return new DefaultErrorHandler(
        );
    }
}
