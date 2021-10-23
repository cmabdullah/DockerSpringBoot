package com.cm.dockerpractice.repository;

import com.cm.dockerpractice.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
