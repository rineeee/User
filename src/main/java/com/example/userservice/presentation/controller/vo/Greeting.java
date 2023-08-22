package com.example.userservice.presentation.controller.vo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Greeting {
    @Value("${greeting.message}")
    private String message;
}
