package rabbitmq.consumer.listeners;

import org.springframework.stereotype.Service;

@Service
public class ListenerQueueOneImpl implements ListenerQueueOne {
    @Override
    public void listen(String message) {
        System.out.println("QueueOne: " + message);
    }
}
