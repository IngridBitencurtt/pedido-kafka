package com.projeto.pedidokafka.domain.exception;

public class ProdutoJaCadastradoException extends RuntimeException {

    public ProdutoJaCadastradoException(String produto) {
        super("Produto já cadastrado: " + produto);
    }
}
