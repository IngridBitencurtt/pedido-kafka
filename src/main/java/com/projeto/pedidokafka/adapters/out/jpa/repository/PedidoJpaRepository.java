package com.projeto.pedidokafka.adapters.out.jpa.repository;

import com.projeto.pedidokafka.adapters.out.jpa.entity.PedidoEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoJpaRepository extends JpaRepository<PedidoEntity, UUID> {

  boolean existsByProduto(String produto);
}
