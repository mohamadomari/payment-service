package com.payment.payment;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Date;

@Service
@Slf4j
public class payServices
{
    @Autowired
    private JavaMailSender mailSender;
    public Response Pay(Body body)
    {
        Response response = new Response(body.getAmount(),new Date(), Response.responseType.success);
        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setFrom("mohammadalomari35353535@gmail.com");
        mailMessage.setTo(body.getAccount().getPerson().getEmail());
        mailMessage.setSubject("Hello");
        mailMessage.setText("this is from spring");
        mailSender.send(mailMessage);
        return  response;
    }
}
