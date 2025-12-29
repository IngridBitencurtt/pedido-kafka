package com.projeto.pedidokafka.adapters.out.kafka;

 import com.projeto.pedidokafka.domain.model.Pedido;
import com.projeto.pedidokafka.domain.ports.PedidoProducerPort;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
 import tools.jackson.databind.ObjectMapper;

@Component
public class PedidoKafkaProducerAdapter implements PedidoProducerPort {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;
    private final String topic;

    public PedidoKafkaProducerAdapter(
            KafkaTemplate<String, String> kafkaTemplate,
            ObjectMapper objectMapper,
            @Value("${app.kafka.topic.pedidos}") String topic
    ) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
        this.topic = topic;
    }

    @Override
    public void enviar(Pedido pedido) {
        try {
            String payload = objectMapper.writeValueAsString(pedido);
            kafkaTemplate.send(topic, pedido.getId(), payload);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar pedido para o Kafka", e);
        }
    }
}
