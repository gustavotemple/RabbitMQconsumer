package rabbitmq.consumer.queues;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public interface QueueOne {

    @RabbitListener(queues = "queue_one")
    public void listen(String message);

}
