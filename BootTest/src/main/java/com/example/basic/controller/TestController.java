package com.example.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //스프링부트는 RestController에 특화됨
public class TestController {

	@GetMapping("/")
	public String test() {
		return "실행됨!@@!@#@!##!#!@#!@#!@#!@#@!#";
	}
}
