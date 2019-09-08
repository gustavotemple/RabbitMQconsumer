package rabbitmq.consumer.queues;

import org.springframework.stereotype.Service;

@Service
public class QueueTwoImpl implements QueueTwo {
    @Override
    public void listen(String message) {
        System.out.println("Consuming " + message);
    }
}
