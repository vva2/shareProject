package com.techprimers.kubernetes.springcloudkubernetesconfigexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class WelcomeController {

    @Value("${message:Welcome to Youtube guys}")
    private String message;

    @GetMapping
    public String welcome() {
        System.out.println(message);
        return message;
    }
}
