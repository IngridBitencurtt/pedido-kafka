package com.projeto.pedidokafka.application.usecase;

import com.projeto.pedidokafka.domain.model.Pedido;
import com.projeto.pedidokafka.domain.ports.PedidoRepositoryPort;

import java.util.List;

public class ConsultarPedidoUseCase {

    private final PedidoRepositoryPort repositoryPort;

    public ConsultarPedidoUseCase(PedidoRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
    }

    public List<Pedido> buscarTodos() {
        return repositoryPort.buscarTodos();
    }

    public Pedido buscarPorId(String id) {
        return repositoryPort.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }
}
