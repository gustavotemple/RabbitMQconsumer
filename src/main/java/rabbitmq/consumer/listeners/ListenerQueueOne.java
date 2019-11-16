package rabbitmq.consumer.listeners;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public interface ListenerQueueOne {

    @RabbitListener(queues = "queue1")
    public void listen(String message);

}
