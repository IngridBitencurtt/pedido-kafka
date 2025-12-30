package com.projeto.pedidokafka.adapters.out.jpa.repository;

import com.projeto.pedidokafka.adapters.out.jpa.entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PedidoJpaRepository extends JpaRepository<PedidoEntity, UUID> {

    boolean existsByProduto(String produto);
}

