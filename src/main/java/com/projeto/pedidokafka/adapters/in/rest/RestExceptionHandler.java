package com.projeto.pedidokafka.adapters.in.rest;

 import com.projeto.pedidokafka.domain.exception.ProdutoJaCadastradoException;
 import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ProdutoJaCadastradoException.class)
    public ResponseEntity<String> handleProdutoJaCadastrado(
            ProdutoJaCadastradoException ex
    ) {
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(ex.getMessage());
    }
}
