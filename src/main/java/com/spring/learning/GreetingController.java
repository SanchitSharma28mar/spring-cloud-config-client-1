package com.spring.learning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingController {

	@Value("${my.greeting}")
	public String greetingsMessage;
	
	@GetMapping("/greet")
	public String greet() {
		return greetingsMessage;
	}
	
}
