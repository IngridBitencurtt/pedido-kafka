package com.projeto.pedidokafka.application.usecase;

import com.projeto.pedidokafka.domain.model.Pedido;
import com.projeto.pedidokafka.domain.ports.PedidoProcessorPort;

public class ProcessarPedidoUseCase {

    private final PedidoProcessorPort processorPort;

    public ProcessarPedidoUseCase(PedidoProcessorPort processorPort) {
        this.processorPort = processorPort;
    }

    public void executar(Pedido pedido) {
        processorPort.processar(pedido);
    }
}
