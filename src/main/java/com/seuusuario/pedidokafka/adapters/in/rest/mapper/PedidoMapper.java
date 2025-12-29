package com.seuusuario.pedidokafka.adapters.in.rest.mapper;

import com.seuusuario.pedidokafka.adapters.in.rest.dto.PedidoRequest;
import com.seuusuario.pedidokafka.domain.model.Pedido;

import java.time.LocalDateTime;
import java.util.UUID;

public class PedidoMapper {

    public static Pedido toDomain(PedidoRequest request) {
        return new Pedido(
                UUID.randomUUID().toString(),
                request.produto(),
                request.valor(),
                LocalDateTime.now()
        );
    }
}
