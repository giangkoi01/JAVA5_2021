package io.spring.service;

import java.util.List;

import io.spring.entities.Product;

public interface ProductService {
	
	Product create(Product category);
	List<Product> readAll(String name);
	Product update(Product category);
	Integer delete(Integer id);
	List<Product> readPage(int pageSize, int pageNumber);
	
}
