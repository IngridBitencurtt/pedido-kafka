package com.projeto.pedidokafka.adapters.out.jpa.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class PedidoEntity {

    @Id
    private String id;

    private String produto;

    private BigDecimal valor;

    private LocalDateTime data;

    protected PedidoEntity() {}

    public PedidoEntity(String id, String produto, BigDecimal valor, LocalDateTime data) {
        this.id = id;
        this.produto = produto;
        this.valor = valor;
        this.data = data;
    }

    public String getId() {
        return id;
    }
}
