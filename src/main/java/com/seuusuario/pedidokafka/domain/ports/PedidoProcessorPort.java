package com.seuusuario.pedidokafka.domain.ports;

import com.seuusuario.pedidokafka.domain.model.Pedido;

public interface PedidoProcessorPort {
    void processar(Pedido pedido);
}
