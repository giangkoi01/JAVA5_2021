package io.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.spring.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}