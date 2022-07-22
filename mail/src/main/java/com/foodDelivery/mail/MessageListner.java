package com.foodDelivery.mail;

import com.foodDelivery.mail.config.MessagingConfig;
import com.foodDelivery.mail.dto.MailDto;
import com.foodDelivery.mail.service.MailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MessageListner {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private MailService mailService;

    @RabbitListener(queues = "mailQueue")
    public void consumeMessageFromQueue(MailDto mailDto){
        javaMailSender.send(mailService.registrationSuccessMail(mailDto.getEmail(), mailDto.getName()));
    }

}
