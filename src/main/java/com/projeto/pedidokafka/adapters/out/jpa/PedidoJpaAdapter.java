package com.projeto.pedidokafka.adapters.out.jpa;

import com.projeto.pedidokafka.adapters.out.jpa.mapper.PedidoEntityMapper;
import com.projeto.pedidokafka.adapters.out.jpa.repository.PedidoJpaRepository;
import com.projeto.pedidokafka.domain.model.Pedido;
import com.projeto.pedidokafka.domain.ports.PedidoRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

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

  @Override
  public List<Pedido> buscarTodos() {
    return repository.findAll()
            .stream()
            .map(PedidoEntityMapper::toDomain)
            .toList();
  }

  @Override
  public Optional<Pedido> buscarPorId(String id) {
    return repository.findById(id)
            .map(PedidoEntityMapper::toDomain);
  }
}
