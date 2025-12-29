package com.projeto.pedidokafka.adapters.out.jpa;

import com.projeto.pedidokafka.adapters.out.jpa.mapper.PedidoEntityMapper;
import com.projeto.pedidokafka.adapters.out.jpa.repository.PedidoJpaRepository;
import com.projeto.pedidokafka.domain.exception.PedidoJaProcessadoException;
import com.projeto.pedidokafka.domain.exception.ProdutoJaCadastradoException;
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

        if (repository.existsByProduto(pedido.getProduto())) {
            throw new ProdutoJaCadastradoException(pedido.getProduto());
        }

        repository.save(PedidoEntityMapper.toEntity(pedido));
    }
}
