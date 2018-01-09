package com.sadasen.springboot2.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2018年1月9日
 * @author lei.ys
 * @desc
 */
@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(String name) {
		return "Hello, " + name;
	}

}
