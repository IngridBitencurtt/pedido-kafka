package com.seuusuario.pedidokafka.application.usecase;

import com.seuusuario.pedidokafka.domain.model.Pedido;
import com.seuusuario.pedidokafka.domain.ports.PedidoProducerPort;

public class EnviarPedidoUseCase {

    private final PedidoProducerPort producerPort;

    public EnviarPedidoUseCase(PedidoProducerPort producerPort) {
        this.producerPort = producerPort;
    }

    public void executar(Pedido pedido) {
        producerPort.enviar(pedido);
    }
}
