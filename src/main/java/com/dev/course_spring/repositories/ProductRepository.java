package com.dev.course_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.course_spring.domains.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
