package com.assignment.wallstreet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wish")
public class WishController {

    @GetMapping
    public String getAll() {
        return "ok";
    }
}
