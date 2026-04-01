package co.com.bancolombia.mq.listener;

import co.com.bancolombia.commons.jms.mq.MQListener;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import jakarta.jms.Message;

@Component
@RequiredArgsConstructor
public class SampleMQMessageListener {
    // private final SampleUseCase useCase;

    // For fixed queues
    @MQListener("${commons.jms.input-queue}")
    public void process(Message message)  {
        // useCase.sample(((TextMessage) message).getText());
    }
}
