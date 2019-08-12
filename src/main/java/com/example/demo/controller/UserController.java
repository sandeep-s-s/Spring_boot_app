package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {
	@GetMapping("/login")
    public String index() {
        return "login";
    }
	
	@PostMapping("/login")
    public String postLogin(@RequestParam("email") String email,@RequestParam("password") String password) {
		System.out.println(email);
		System.out.println(password);
        return "login";
    }
}
