package com.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/issues")
    public String[] getIssues() {
        return new String[]{"Issue 1", "Issue 2", "Issue 3"};
    }
}