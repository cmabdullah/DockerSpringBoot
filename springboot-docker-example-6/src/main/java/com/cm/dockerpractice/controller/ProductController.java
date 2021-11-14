package com.cm.dockerpractice.controller;

import com.cm.dockerpractice.domain.Product;
import com.cm.dockerpractice.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
@Slf4j
@RestController
@RequestMapping(value = "/api/v1/product")
public class ProductController {
//http://localhost:8080/api/v1/product/get
	@Autowired
	ProductService productService;

	@GetMapping("/get")
	public ResponseEntity<List<Product>> get() {
		return ResponseEntity.ok(productService.readProducts());
	}

	@PostMapping("/save")
	public ResponseEntity<Product> save(@RequestBody Product product) {
		Product savedProduct = productService.save(product);
		return ResponseEntity.ok(savedProduct);
	}
}
