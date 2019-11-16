package rabbitmq.consumer.listeners;

import org.springframework.stereotype.Service;

@Service
public class ListenerQueueTwoImpl implements ListenerQueueTwo {
    @Override
    public void listen(String message) {
        System.out.println("queue_two: " + message);
    }
}
