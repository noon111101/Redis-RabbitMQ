package com.trieuph.producer;


import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/message")
    public void sendMessage(@RequestBody final Message message) {
        MessageProducer messageProducer = new MessageProducer(rabbitTemplate);

        // Gửi tin nhắn bằng cách gọi phương thức sendMessage
        messageProducer.sendMessage(message.getMessage());
    }
}
