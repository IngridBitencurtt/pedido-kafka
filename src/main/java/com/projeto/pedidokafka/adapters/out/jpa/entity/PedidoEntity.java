package com.projeto.pedidokafka.adapters.out.jpa.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(
    name = "pedidos",
    uniqueConstraints = {@UniqueConstraint(columnNames = "produto")})
public class PedidoEntity {

  @Id private String id;

  @Column(nullable = false, unique = true)
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

  public String getProduto() {
    return produto;
  }
}
