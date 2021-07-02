package com.example.democorsback;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ApiController {

    @GetMapping
    public ResponseEntity<String> apiGet() {
        return ResponseEntity.ok("Hello from API GET");
    }

    @GetMapping("2_1")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> apiGet2_1() {
        return ResponseEntity.ok("Hello from API GET");
    }


    @GetMapping("2_2")
    @CrossOrigin(origins = "*")
    public ResponseEntity<String> apiGet2_2() {
        return ResponseEntity.ok("Hello from API GET");
    }


    @GetMapping("2_3")
    @CrossOrigin(originPatterns = "*localhost*")
    public ResponseEntity<String> apiGet2_3() {
        return ResponseEntity.ok("Hello from API GET");
    }


    @PostMapping("3_1")
    public ResponseEntity<String> apiPost3_1() {
        return ResponseEntity.ok("Hello from API POST");
    }
}