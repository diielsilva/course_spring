package com.dev.course_spring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.course_spring.domains.Category;
import com.dev.course_spring.repositories.CategoryRepository;

@SpringBootApplication
public class CourseSpringApplication implements CommandLineRunner {
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(CourseSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category01 = new Category(null, "Informática");
		Category category02 = new Category(null, "Escritório");
		this.categoryRepository.saveAll(Arrays.asList(category01, category02));
	}

}
