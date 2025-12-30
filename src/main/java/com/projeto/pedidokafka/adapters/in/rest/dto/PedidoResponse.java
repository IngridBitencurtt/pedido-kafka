package com.projeto.pedidokafka.adapters.in.rest.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PedidoResponse(
        String id,
        String produto,
        BigDecimal valor,
        LocalDateTime data
) {}
