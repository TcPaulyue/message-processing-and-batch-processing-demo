package com.demo.messageprocess;

import com.demo.messageprocess.model.Message;
import com.demo.messageprocess.model.State;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;


@Repository
public interface MessageRepository extends ReactiveMongoRepository<Message,String> {
    Flux<Message> findAllByReceiverAndState(String receiver, State state);
    Flux<Message> findAllByReceiver(String receiver);
}
