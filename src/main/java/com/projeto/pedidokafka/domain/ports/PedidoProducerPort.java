package com.projeto.pedidokafka.domain.ports;

import com.projeto.pedidokafka.domain.model.Pedido;

public interface PedidoProducerPort {
    void enviar(Pedido pedido);
}
