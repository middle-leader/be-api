package com.middleleader.beapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class L7HealthCheck {

	@GetMapping("/l7-healthcheck")
	public HttpStatus getHealthCheck() {
		return HttpStatus.OK;
	}
}
