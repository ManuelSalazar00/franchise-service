package co.com.bancolombia.sqs.listener;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.sqs.model.Message;

import java.util.function.Consumer;

@Service
@RequiredArgsConstructor
public class SQSProcessor implements Consumer<Message> {
    // private final MyUseCase myUseCase;

    @Override
    public void accept(Message message) {
        // myUseCase.doAny(message.body());
    }
}
