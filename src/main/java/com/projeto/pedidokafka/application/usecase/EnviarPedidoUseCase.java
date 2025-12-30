package com.projeto.pedidokafka.application.usecase;

import com.projeto.pedidokafka.domain.exception.ProdutoJaCadastradoException;
import com.projeto.pedidokafka.domain.model.Pedido;
import com.projeto.pedidokafka.domain.ports.PedidoProducerPort;
import com.projeto.pedidokafka.domain.ports.PedidoRepositoryPort;

public class EnviarPedidoUseCase {

  private final PedidoRepositoryPort repositoryPort;
  private final PedidoProducerPort producerPort;

  public EnviarPedidoUseCase(PedidoRepositoryPort repositoryPort, PedidoProducerPort producerPort) {
    this.repositoryPort = repositoryPort;
    this.producerPort = producerPort;
  }

  public void executar(Pedido pedido) {
    if (repositoryPort.existeProduto(pedido.produto())) {
      throw new ProdutoJaCadastradoException("Produto já cadastrado: " + pedido.produto());
    }

    producerPort.enviar(pedido);
  }
}
