package com.example.demo;

import org.jodconverter.core.DocumentConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @Value("${jodconverter.local.enabled}")
    private Boolean isJodconverterEnabled;

    @Autowired
    private DocumentConverter documentConverter;

    @GetMapping("hello")
    public String hello() {
        return "Jodconverter enabled: " + isJodconverterEnabled;
    }

}
