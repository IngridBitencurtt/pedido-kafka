package com.seuusuario.pedidokafka.adapters.in.kafka.mapper;

 import com.seuusuario.pedidokafka.domain.model.Pedido;
 import tools.jackson.databind.ObjectMapper;

public class PedidoKafkaMapper {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static Pedido fromJson(String json) {
        try {
            return mapper.readValue(json, Pedido.class);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao converter mensagem Kafka", e);
        }
    }
}
