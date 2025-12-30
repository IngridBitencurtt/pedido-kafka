package com.projeto.pedidokafka.adapters.in.rest;

import com.projeto.pedidokafka.adapters.in.rest.dto.PedidoRequest;
import com.projeto.pedidokafka.adapters.in.rest.dto.PedidoResponse;
import com.projeto.pedidokafka.adapters.in.rest.mapper.PedidoMapper;
import com.projeto.pedidokafka.adapters.in.rest.mapper.PedidoResponseMapper;
import com.projeto.pedidokafka.application.usecase.ConsultarPedidoUseCase;
import com.projeto.pedidokafka.application.usecase.EnviarPedidoUseCase;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

  private final EnviarPedidoUseCase enviarPedidoUseCase;
  private final ConsultarPedidoUseCase consultarPedidoUseCase;

  public PedidoController(
      EnviarPedidoUseCase enviarPedidoUseCase, ConsultarPedidoUseCase consultarPedidoUseCase) {
    this.enviarPedidoUseCase = enviarPedidoUseCase;
    this.consultarPedidoUseCase = consultarPedidoUseCase;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.ACCEPTED)
  public void criarPedido(@RequestBody PedidoRequest request) {
    enviarPedidoUseCase.executar(PedidoMapper.toDomain(request));
  }

  @GetMapping
  public List<PedidoResponse> listarPedidos() {
    return consultarPedidoUseCase.buscarTodos().stream()
        .map(PedidoResponseMapper::toResponse)
        .toList();
  }
}
