package com.projeto.pedidokafka.adapters.out.jpa;

import com.projeto.pedidokafka.adapters.out.jpa.mapper.PedidoEntityMapper;
import com.projeto.pedidokafka.adapters.out.jpa.repository.PedidoJpaRepository;
import com.projeto.pedidokafka.domain.model.Pedido;
import com.projeto.pedidokafka.domain.ports.PedidoRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class PedidoJpaAdapter implements PedidoRepositoryPort {

    private final PedidoJpaRepository repository;

    public PedidoJpaAdapter(PedidoJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void salvar(Pedido pedido) {
        repository.save(PedidoEntityMapper.toEntity(pedido));
    }

    @Override
    public boolean existeProduto(String produto) {
        return repository.existsByProduto(produto);
    }
}
