package af.gov.anar.lib.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class AnarProducer<T> {

    @Autowired
    private KafkaTemplate<String, T> template;

    public void  produce(String topic, T obj)
    {
        template.send(topic, obj);
    }
}
