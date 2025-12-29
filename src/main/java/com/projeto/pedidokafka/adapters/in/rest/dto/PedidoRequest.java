package com.projeto.pedidokafka.adapters.in.rest.dto;

import java.math.BigDecimal;

public record PedidoRequest(
        String produto,
        BigDecimal valor
) {
}
