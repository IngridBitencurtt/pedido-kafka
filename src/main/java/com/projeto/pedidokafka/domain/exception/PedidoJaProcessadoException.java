package com.projeto.pedidokafka.domain.exception;

public class PedidoJaProcessadoException extends RuntimeException {

    public PedidoJaProcessadoException(String pedidoId) {
        super("Pedido já processado: " + pedidoId);
    }
}
