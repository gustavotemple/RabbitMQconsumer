package rabbitmq.consumer.queues;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public interface QueueTwo {

    @RabbitListener(queues = "queue_two")
    public void listen(String message);

}
