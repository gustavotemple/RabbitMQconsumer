package rabbitmq.consumer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("destinations")
public class DestinationsConfig {

    private Map<String, DestinationInfo> queues = new HashMap<>();

    public Map<String, DestinationInfo> getQueues() {
        return queues;
    }

    public void setQueues(Map<String, DestinationInfo> queues) {
        this.queues = queues;
    }

    // DestinationInfo stores the Exchange name and routing key used
    // by producers when posting messages
    static class DestinationInfo {

        private String exchange;
        private String routingKey;

        public String getExchange() {
            return exchange;
        }

        public void setExchange(String exchange) {
            this.exchange = exchange;
        }

        public String getRoutingKey() {
            return routingKey;
        }

        public void setRoutingKey(String routingKey) {
            this.routingKey = routingKey;
        }

    }

}
