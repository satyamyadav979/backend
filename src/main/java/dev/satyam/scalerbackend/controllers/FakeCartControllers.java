package dev.satyam.scalerbackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FakeCartControllers {
    @GetMapping("/carts")
    public String getCart() {
        return "Hello from cart";
    }
}
