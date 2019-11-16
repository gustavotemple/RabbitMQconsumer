package rabbitmq.consumer.listeners;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public interface ListenerQueueTwo {

    @RabbitListener(queues = "queue2")
    public void listen(String message);

}
