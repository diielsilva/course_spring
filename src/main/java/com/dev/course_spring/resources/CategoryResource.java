package com.dev.course_spring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.course_spring.domains.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Category> test() {
		Category categroy01 = new Category(1, "Informática");
		Category category02 = new Category(2, "Escritório");
		List<Category> categories = new ArrayList<Category>();
		categories.add(categroy01);
		categories.add(category02);
		return categories;
	}
}
