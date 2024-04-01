package com.payment.payment;

import org.example.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

// return body response : enum status : Fail , Sucess,  processing  ,
//amount :
// time

@RestController
@RequestMapping("/paying")
public class payController {
   private final payServices payServices;
    @Autowired
    public payController(payServices payServices){
    this.payServices=payServices;
    }
    @PostMapping("/pay")
    public Response Pay(@RequestBody Body body)
    {
       Response response= payServices.Pay(body);
        return  response;
    }
}
