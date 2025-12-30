package com.projeto.pedidokafka.application.usecase;

import com.projeto.pedidokafka.domain.model.Pedido;
import com.projeto.pedidokafka.domain.ports.PedidoRepositoryPort;
import java.util.List;

public class ConsultarPedidoUseCase {

  private final PedidoRepositoryPort repositoryPort;

  public ConsultarPedidoUseCase(PedidoRepositoryPort repositoryPort) {
    this.repositoryPort = repositoryPort;
  }

  public List<Pedido> buscarTodos() {
    return repositoryPort.buscarTodos();
  }
}
