package com.projeto.pedidokafka.application.usecase;

import com.projeto.pedidokafka.domain.model.Pedido;
import com.projeto.pedidokafka.domain.ports.PedidoProcessorPort;
import com.projeto.pedidokafka.domain.ports.PedidoRepositoryPort;

public class ProcessarPedidoUseCase {

    private final PedidoProcessorPort processorPort;
    private final PedidoRepositoryPort repositoryPort;

    public ProcessarPedidoUseCase(
            PedidoProcessorPort processorPort,
            PedidoRepositoryPort repositoryPort
    ) {
        this.processorPort = processorPort;
        this.repositoryPort = repositoryPort;
    }

    public void executar(Pedido pedido) {
        repositoryPort.salvar(pedido);
        processorPort.processar(pedido);
    }
}
