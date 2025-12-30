package com.projeto.pedidokafka.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pedido {

  private final String id;
  private final String produto;
  private final BigDecimal valor;
  private final LocalDateTime data;

  public Pedido(String id, String produto, BigDecimal valor, LocalDateTime data) {
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

  public BigDecimal getValor() {
    return valor;
  }

  public LocalDateTime getData() {
    return data;
  }
}
