package com.pack.sample1.registration;

import javax.imageio.spi.RegisterableService;

import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;



@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController{

    private registrationService registrationService;
    
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }

}