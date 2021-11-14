package com.abdullah.customserverupstreammock.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class TestController {
	@GetMapping("/add")
	public ResponseEntity<String> add(
			@RequestParam String a1, @RequestParam String a2) {
		//http://localhost:8080//api/v1/product//add?a1=BJIT&a2=Ltd.
		String response = a1 + " " + a2;
		return ResponseEntity.ok(response);
	}
}
