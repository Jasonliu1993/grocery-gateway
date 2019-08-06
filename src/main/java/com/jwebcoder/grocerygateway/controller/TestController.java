package com.jwebcoder.grocerygateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/find")
    public List<String> find() {
        return Collections.emptyList();
    }

}
