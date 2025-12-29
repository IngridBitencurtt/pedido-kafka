package com.seuusuario.pedidokafka.application.usecase;

import com.seuusuario.pedidokafka.domain.model.Pedido;
import com.seuusuario.pedidokafka.domain.ports.PedidoProcessorPort;

public class ProcessarPedidoUseCase {

    private final PedidoProcessorPort processorPort;

    public ProcessarPedidoUseCase(PedidoProcessorPort processorPort) {
        this.processorPort = processorPort;
    }

    public void executar(Pedido pedido) {
        processorPort.processar(pedido);
    }
}
