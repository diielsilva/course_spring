package com.dev.course_spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.course_spring.domains.Category;
import com.dev.course_spring.exception.DomainNotFoundException;
import com.dev.course_spring.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	public Category findById(Integer id) {
		Category category = this.categoryRepository.findById(id).get();
		if (category == null) {
			throw new DomainNotFoundException("Domain not found!");
		}
		return category;
	}
}
