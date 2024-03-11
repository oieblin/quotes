package com.example.quotes.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MainService {
    private static final String QUOTE_API_URL = "https://favqs.com/api/qotd";

    private final RestTemplate restTemplate;

    public MainService(RestTemplate restTemplate) {

        this.restTemplate = restTemplate;
    }

    public String getQuote(String action) {
        String url = QUOTE_API_URL + action;
        return restTemplate.getForObject(url, String.class);
    }
}

