package com.niMap.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.niMap.entity.Category;
import com.niMap.repository.CategoryRepository;


@Service
public  class CategoryService  {

	@Autowired
	private CategoryRepository repository;
	

	public List<Category> getAllCategory() {
		return repository.findAll();
	}

	public Category saveCategory(Category category) {
		return repository.save(category);
	}

	public Category findById(long id) {
		return repository.findById(id).get();
	}
	
	public Category updateCategory(long id, Category category) {
		Category category2= findById(id);
		category2.setName(category.getName());
		category2.setProducts(category.getProducts());
		return repository.save(category2);
	}

	
	public void deleteCategory(long id) {
		repository.delete(findById(id));
	}
	
	 public Page<Category> getCategories(int page) {
		 
		 if(page!=0) {
			 Pageable pageable = PageRequest.of(page, 4);
			 return repository.findAll(pageable);
			 
		 }
		 Pageable pageable = PageRequest.of(0, 4);
		 return repository.findAll(pageable);
	
		 
	    }
	
}
