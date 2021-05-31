package io.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import io.spring.entities.Category;
import io.spring.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category create(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> readAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category update(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Integer delete(Integer id) {
		categoryRepository.deleteById(id);
		return id;
	}

	@Override
	public List<Category> readPage(int pageSize, int pageNumber) {
		//create page able
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		Page<Category> page = categoryRepository.page(pageable);
//		
//		List<Category> result = PageImpl.
//		
//		
		return null;
	}

}
