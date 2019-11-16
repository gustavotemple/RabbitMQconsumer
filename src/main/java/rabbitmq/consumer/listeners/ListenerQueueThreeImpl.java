package rabbitmq.consumer.listeners;

import org.springframework.stereotype.Service;

@Service
public class ListenerQueueThreeImpl implements ListenerQueueThree {
    @Override
    public void listen(String message) {
        System.out.println("QueueThree: " + message);
    }
}
