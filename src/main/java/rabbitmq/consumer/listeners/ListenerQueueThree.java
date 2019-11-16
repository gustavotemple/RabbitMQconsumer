package rabbitmq.consumer.listeners;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public interface ListenerQueueThree {

    @RabbitListener(queues = "queue3")
    public void listen(String message);

}
