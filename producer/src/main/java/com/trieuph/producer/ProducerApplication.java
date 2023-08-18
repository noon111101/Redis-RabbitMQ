package com.trieuph.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ProducerApplication.class, args);
        // Lấy bean của MessageProducer từ ApplicationContext
        MessageProducer messageProducer = context.getBean(MessageProducer.class);

        // Gửi tin nhắn bằng cách gọi phương thức sendMessage
        messageProducer.sendMessage("Hello RabbitMQ!");
    }
}