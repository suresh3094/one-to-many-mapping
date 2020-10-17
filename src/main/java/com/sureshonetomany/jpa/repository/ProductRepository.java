package com.sureshonetomany.jpa.repository;

import com.sureshonetomany.jpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product,Integer> {
}
