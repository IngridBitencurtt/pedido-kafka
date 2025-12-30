package com.projeto.pedidokafka.adapters.out.jpa.mapper;

import com.projeto.pedidokafka.adapters.out.jpa.entity.PedidoEntity;
import com.projeto.pedidokafka.domain.model.Pedido;

public class PedidoEntityMapper {

  public static PedidoEntity toEntity(Pedido pedido) {
    return new PedidoEntity(
        pedido.getId(), pedido.getProduto(), pedido.getValor(), pedido.getData());
  }
  public static Pedido toDomain(PedidoEntity entity) {
    return new Pedido(
            entity.getId(),
            entity.getProduto(),
            entity.getValor(),
            entity.getData()
    );
  }
}
