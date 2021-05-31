package io.spring.service;

import java.util.List;

import io.spring.entities.Category;

public interface CategoryService {
	
	Category create(Category category);
	List<Category> readAll();
	Category update(Category category);
	Integer delete(Integer id);
	List<Category> readPage(int pageSize, int pageNumber);
	
}
