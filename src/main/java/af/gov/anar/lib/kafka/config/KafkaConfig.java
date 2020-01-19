package af.gov.anar.lib.kafka.config;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    @Bean
    public KafkaProperties kafkaProperties()
    {
        return new KafkaProperties();
    }
}
