package com.sample.sprecat.web.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    
    @PostMapping("/test")
	public String test(@RequestBody Map<String, Object> map) {
        return "world " + map.get("param1");
	}
}
