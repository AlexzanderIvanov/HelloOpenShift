package org.aivanov.hello.open.shift.controller;

import org.aivanov.hello.open.shift.controller.domain.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class HelloController {

	@RequestMapping
	public Greeting hello() {
		return new Greeting("Hello");
	}
}
