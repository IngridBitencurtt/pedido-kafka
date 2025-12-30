package com.projeto.pedidokafka.adapters.out.jpa.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.*;

@Entity
@Table(
    name = "pedidos",
    uniqueConstraints = {@UniqueConstraint(columnNames = "produto")})
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class PedidoEntity {

  @Id private String id;

  @Column(nullable = false)
  private String produto;

  @Column(nullable = false)
  private BigDecimal valor;

  @Column(nullable = false)
  private LocalDateTime data;
}
