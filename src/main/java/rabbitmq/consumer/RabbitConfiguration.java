package rabbitmq.consumer;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class RabbitConfiguration {

    private final AmqpAdmin amqpAdmin;
    private final DestinationsConfig destinationsConfig;

    @Autowired
    public RabbitConfiguration(AmqpAdmin amqpAdmin, DestinationsConfig destinationsConfig) {
        this.amqpAdmin = amqpAdmin;
        this.destinationsConfig = destinationsConfig;
    }

    @PostConstruct
    public void setupQueueDestinations() {
        destinationsConfig.getQueues()
                .forEach((key, destination) -> {
                    Exchange ex = ExchangeBuilder.directExchange(
                            destination.getExchange())
                            .durable(true)
                            .build();
                    amqpAdmin.declareExchange(ex);
                    Queue q = QueueBuilder.durable(
                            key)
                            .build();
                    amqpAdmin.declareQueue(q);
                    Binding b = BindingBuilder.bind(q)
                            .to(ex)
                            .with(destination.getRoutingKey())
                            .noargs();
                    amqpAdmin.declareBinding(b);
                });
    }
}
