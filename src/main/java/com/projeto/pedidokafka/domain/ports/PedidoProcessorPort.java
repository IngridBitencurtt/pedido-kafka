package com.projeto.pedidokafka.domain.ports;

import com.projeto.pedidokafka.domain.model.Pedido;

public interface PedidoProcessorPort {
  void processar(Pedido pedido);
}
