package io.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import io.spring.entities.Product;
import io.spring.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product create(Product product) {
		return productRepository.save(product);
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Product> readAll(String name) {
		List<Product> list = new ArrayList<Product>();
		if(StringUtils.isEmpty(name)) {
			list = productRepository.findAll();
		} else {
			list = productRepository.findByNameContaining(name);
		}
		return list;
	}

	@Override
	public Product update(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Integer delete(Integer id) {
		productRepository.deleteById(id);
		return id;
	}

	@Override
	public List<Product> readPage(int pageSize, int pageNumber) {
		//create page able
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		/* Page<Product> page = productRepository.page(pageable); */
//		
//		List<Product> result = PageImpl.
//		
//		
		return null;
	}

}
