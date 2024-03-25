package com.example.quotes.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class QuoteEntity {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
