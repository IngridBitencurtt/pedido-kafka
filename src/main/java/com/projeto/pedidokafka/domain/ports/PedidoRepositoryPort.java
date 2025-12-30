package com.projeto.pedidokafka.domain.ports;

import com.projeto.pedidokafka.domain.model.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoRepositoryPort {

  void salvar(Pedido pedido);

  boolean existeProduto(String produto);

  List<Pedido> buscarTodos();

  Optional<Pedido> buscarPorId(String id);
}
