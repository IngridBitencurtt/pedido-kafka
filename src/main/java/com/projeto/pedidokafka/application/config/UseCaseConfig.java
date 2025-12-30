package com.projeto.pedidokafka.application.config;

import com.projeto.pedidokafka.application.usecase.ConsultarPedidoUseCase;
import com.projeto.pedidokafka.application.usecase.EnviarPedidoUseCase;
import com.projeto.pedidokafka.application.usecase.ProcessarPedidoUseCase;
import com.projeto.pedidokafka.domain.ports.PedidoProducerPort;
import com.projeto.pedidokafka.domain.ports.PedidoRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

  @Bean
  public EnviarPedidoUseCase enviarPedidoUseCase(
      PedidoRepositoryPort repositoryPort, PedidoProducerPort producerPort) {
    return new EnviarPedidoUseCase(repositoryPort, producerPort);
  }

  @Bean
  public ProcessarPedidoUseCase processarPedidoUseCase(PedidoRepositoryPort repositoryPort) {
    return new ProcessarPedidoUseCase(repositoryPort);
  }

  @Bean
  public ConsultarPedidoUseCase consultarPedidoUseCase(PedidoRepositoryPort repositoryPort) {
    return new ConsultarPedidoUseCase(repositoryPort);
  }
}
