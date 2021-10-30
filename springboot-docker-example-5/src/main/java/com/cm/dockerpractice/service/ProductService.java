package com.cm.dockerpractice.service;

import com.cm.dockerpractice.domain.Product;
import com.cm.dockerpractice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> readProducts () {
		return productRepository.findAll();
	}

	public Product save(Product product) {
		return productRepository.save(product);
	}
}
