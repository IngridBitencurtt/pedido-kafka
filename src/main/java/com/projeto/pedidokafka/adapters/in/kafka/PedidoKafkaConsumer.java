package com.projeto.pedidokafka.adapters.in.kafka;

import com.projeto.pedidokafka.adapters.in.kafka.mapper.PedidoKafkaMapper;
import com.projeto.pedidokafka.application.usecase.ProcessarPedidoUseCase;
import com.projeto.pedidokafka.domain.model.Pedido;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PedidoKafkaConsumer {

  private final ProcessarPedidoUseCase processarPedidoUseCase;

  public PedidoKafkaConsumer(ProcessarPedidoUseCase processarPedidoUseCase) {
    this.processarPedidoUseCase = processarPedidoUseCase;
  }

  @KafkaListener(
      topics = "${app.kafka.topic.pedidos}",
      groupId = "${spring.kafka.consumer.group-id}")
  public void consumir(String message) {
    Pedido pedido = PedidoKafkaMapper.fromJson(message);
    processarPedidoUseCase.executar(pedido);
  }
}
