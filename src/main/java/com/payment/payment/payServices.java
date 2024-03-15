package com.payment.payment;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.example.Body;
import org.example.Response;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Date;

@Service
@Slf4j
public class payServices
{
    public Response Pay(Body body)
    {
        Response response = new Response(body.getAmount(),new Date(), Response.responseType.processing);
        return  response;
    }
}
