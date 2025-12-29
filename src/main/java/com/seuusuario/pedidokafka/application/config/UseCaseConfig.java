package com.seuusuario.pedidokafka.application.config;

import com.seuusuario.pedidokafka.application.usecase.EnviarPedidoUseCase;
import com.seuusuario.pedidokafka.domain.ports.PedidoProducerPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public EnviarPedidoUseCase enviarPedidoUseCase(PedidoProducerPort producerPort) {
        return new EnviarPedidoUseCase(producerPort);
    }
}
