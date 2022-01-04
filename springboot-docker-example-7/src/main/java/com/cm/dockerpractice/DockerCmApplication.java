package com.cm.dockerpractice;

import com.cm.dockerpractice.domain.Product;
import com.cm.dockerpractice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DockerCmApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(DockerCmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Product> list = Arrays.asList(
				new Product(1L, "P1"),
				new Product(2L, "P2"),
				new Product(3L, "P3"),
				new Product(4L, "P4"),
				new Product(5L, "P5")
		);

		productRepository.saveAll(list);
	}
}
