package com.brains.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

	@GetMapping("/")
	public String product() {
		
		System.out.println("This is ProductHome!111122223333");
		
		return "This is ProductHome!111122223333";
	}
}
