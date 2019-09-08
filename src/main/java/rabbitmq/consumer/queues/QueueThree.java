package rabbitmq.consumer.queues;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public interface QueueThree {

    @RabbitListener(queues = "queue_three")
    public void listen(String message);

}
