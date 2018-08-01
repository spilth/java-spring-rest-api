package com.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @RequestMapping("/api/v1/message")
    public Message message() {
        return new Message("Hello, world!");
    }
}
