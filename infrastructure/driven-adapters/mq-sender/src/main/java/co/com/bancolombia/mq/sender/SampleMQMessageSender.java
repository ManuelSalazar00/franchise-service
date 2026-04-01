package co.com.bancolombia.mq.sender;

import co.com.bancolombia.commons.jms.api.MQMessageSenderSync;
import co.com.bancolombia.commons.jms.mq.EnableMQGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
@EnableMQGateway(scanBasePackages = "co.com.bancolombia")
public class SampleMQMessageSender /* implements SomeGateway */ {
    private final MQMessageSenderSync sender;

    public String send(String message) {
        return sender.send(context ->
//          Message textMessage = context.createTextMessage(message);
//          textMessage.setJMSReplyTo(container.get("any-custom-value")); // Inject the reply to queue from container
            context.createTextMessage(message)
        );
    }
}
