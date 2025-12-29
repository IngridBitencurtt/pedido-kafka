package com.projeto.pedidokafka.application.config;

import com.projeto.pedidokafka.application.usecase.EnviarPedidoUseCase;
import com.projeto.pedidokafka.domain.ports.PedidoProducerPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public EnviarPedidoUseCase enviarPedidoUseCase(PedidoProducerPort producerPort) {
        return new EnviarPedidoUseCase(producerPort);
    }
}
