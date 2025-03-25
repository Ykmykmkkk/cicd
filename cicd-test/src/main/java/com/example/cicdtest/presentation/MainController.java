package com.example.cicdtest.presentation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/")
public class MainController {
    @GetMapping("/")
    public String getUsername(){
        String username = "안녕";
        return username;
    }
}
