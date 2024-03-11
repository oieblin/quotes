package com.example.quotes.controllers;

import com.example.quotes.service.MainService;
import org.springframework.web.bind.annotation.*;

@RestController
@ControllerAdvice
@RequestMapping("/api/v1")
public class CommonController {
    private final MainService service;

    public CommonController(MainService service) {

        this.service = service;
    }

    @GetMapping("/{action}")
    public String getQuote(@PathVariable String action) {

        return service.getQuote(action);
    }
}


