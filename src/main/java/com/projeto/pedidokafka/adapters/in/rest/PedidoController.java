package com.projeto.pedidokafka.adapters.in.rest;

import com.projeto.pedidokafka.adapters.in.rest.dto.PedidoRequest;
import com.projeto.pedidokafka.adapters.in.rest.mapper.PedidoMapper;
import com.projeto.pedidokafka.application.usecase.EnviarPedidoUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final EnviarPedidoUseCase enviarPedidoUseCase;

    public PedidoController(EnviarPedidoUseCase enviarPedidoUseCase) {
        this.enviarPedidoUseCase = enviarPedidoUseCase;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void criarPedido(@RequestBody PedidoRequest request) {
        enviarPedidoUseCase.executar(
                PedidoMapper.toDomain(request)
        );
    }
}
