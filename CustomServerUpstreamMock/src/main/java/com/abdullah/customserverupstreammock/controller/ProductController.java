package com.abdullah.customserverupstreammock.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.Callable;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/product")
public class ProductController {

	@GetMapping("/add")
	public ResponseEntity<String> add(
			@RequestParam String a1, @RequestParam String a2) {
		//http://localhost:8080/api/v1/product/add?a1=dhaka&a2=city
		//http://localhost:8080/api/v1/product/add?a1=khulna&a2=city
		//http://localhost:8080/api/v1/product/add?a1=Chittagong&a2=city
		//http://localhost:8080/api/v1/product/add?a1=sylet&a2=city

		String response = "";

		String requestId = RandomStringUtils.randomAlphanumeric(10);

		log.info("Pram 2 "+a2+ " requestId "+ requestId);

		if (a2.contains("dhaka")) {
			Callable<String> callable = () -> {
				// Perform some computation
				Thread.sleep(30000);
				return "Prepared response by waiting half minute";
			};

			try {
				response = callable.call();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (a2.contains("khulna")) {
			Callable<String> callable = () -> {
				// Perform some computation
				Thread.sleep(60000);
				return "Prepared response by waiting one minute";
			};

			try {
				response = callable.call();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else {
			response = a1 +" "+ a2;
		}
		log.info("response "+response+ " requestId "+ requestId);
		return ResponseEntity.ok(response);
	}

}
