package com.projeto.pedidokafka.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Pedido(String id, String produto, BigDecimal valor, LocalDateTime data) {}
