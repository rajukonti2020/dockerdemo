package com.docker.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

	@GetMapping("/")
	public String dockerTest() {


		return "Hello Docker";

	}

}
