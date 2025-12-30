package com.projeto.pedidokafka.application.usecase;

import com.projeto.pedidokafka.domain.model.Pedido;
import com.projeto.pedidokafka.domain.ports.PedidoRepositoryPort;

public class ProcessarPedidoUseCase {

  private final PedidoRepositoryPort repositoryPort;

  public ProcessarPedidoUseCase(PedidoRepositoryPort repositoryPort) {
    this.repositoryPort = repositoryPort;
  }

  public void executar(Pedido pedido) {
    repositoryPort.salvar(pedido);
  }
}
