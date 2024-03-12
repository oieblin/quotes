package com.example.quotes.controllers;

import com.example.quotes.service.QuotesService;
import org.springframework.web.bind.annotation.*;

@RestController
@ControllerAdvice
@RequestMapping("/api/v1")
public class QuotesController {
    private final QuotesService service;

    public QuotesController(QuotesService service) {

        this.service = service;
    }

    @GetMapping("/{action}")
    public String getQuote(@PathVariable String action) {

        return service.getQuote(action);
    }
}



