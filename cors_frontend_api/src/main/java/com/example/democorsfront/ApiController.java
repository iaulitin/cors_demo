package com.example.democorsfront;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiController {

    @GetMapping
    public ResponseEntity<String> apiGet() {
        return ResponseEntity.ok("Hello from API GET");
    }
}
