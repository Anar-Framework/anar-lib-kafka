package af.gov.anar.lib.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class AnarConsumer<T> {


    @KafkaListener(topics =  )
    public T receive(T obj) {
        return obj;
    }
}
