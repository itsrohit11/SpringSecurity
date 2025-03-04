package com.example.SecurityExample;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {



    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/user")
    public String user(){
        return "Hello User";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin";
    }
}
