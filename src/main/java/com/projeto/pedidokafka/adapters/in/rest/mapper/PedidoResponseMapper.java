package com.projeto.pedidokafka.adapters.in.rest.mapper;

import com.projeto.pedidokafka.adapters.in.rest.dto.PedidoResponse;
import com.projeto.pedidokafka.domain.model.Pedido;

public class PedidoResponseMapper {

  public static PedidoResponse toResponse(Pedido pedido) {
    return new PedidoResponse(pedido.id(), pedido.produto(), pedido.valor(), pedido.data());
  }
}
