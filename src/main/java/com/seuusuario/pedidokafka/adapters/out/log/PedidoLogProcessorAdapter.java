package com.seuusuario.pedidokafka.adapters.out.log;

import com.seuusuario.pedidokafka.domain.model.Pedido;
import com.seuusuario.pedidokafka.domain.ports.PedidoProcessorPort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PedidoLogProcessorAdapter implements PedidoProcessorPort {

    private static final Logger log =
            LoggerFactory.getLogger(PedidoLogProcessorAdapter.class);

    @Override
    public void processar(Pedido pedido) {
        log.info(
                "Pedido processado | id={} | produto={} | valor={} | data={}",
                pedido.getId(),
                pedido.getProduto(),
                pedido.getValor(),
                pedido.getData()
        );
    }
}
