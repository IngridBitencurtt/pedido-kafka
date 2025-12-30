package com.projeto.pedidokafka.domain.ports;

import com.projeto.pedidokafka.domain.model.Pedido;

public interface PedidoRepositoryPort {
  void salvar(Pedido pedido);

  boolean existeProduto(String produto);
}
