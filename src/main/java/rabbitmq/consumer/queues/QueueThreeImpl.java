package rabbitmq.consumer.queues;

import org.springframework.stereotype.Service;

@Service
public class QueueThreeImpl implements QueueThree {
    @Override
    public void listen(String message) {
        System.out.println("QueueThree: " + message);
    }
}
