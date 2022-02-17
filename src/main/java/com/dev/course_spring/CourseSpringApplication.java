package com.dev.course_spring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.course_spring.domains.Category;
import com.dev.course_spring.domains.City;
import com.dev.course_spring.domains.Product;
import com.dev.course_spring.domains.State;
import com.dev.course_spring.repositories.CategoryRepository;
import com.dev.course_spring.repositories.CityRepository;
import com.dev.course_spring.repositories.ProductRepository;
import com.dev.course_spring.repositories.StateRepository;

@SpringBootApplication
public class CourseSpringApplication implements CommandLineRunner {
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private StateRepository stateRepository;
	@Autowired
	private CityRepository cityRepository;

	public static void main(String[] args) {
		SpringApplication.run(CourseSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category01 = new Category(null, "Informática");
		Category category02 = new Category(null, "Escritório");
		Product product01 = new Product(null, "Computador", 2000.00);
		Product product02 = new Product(null, "Impressora", 800.00);
		Product product03 = new Product(null, "Mouse", 80.00);
		category01.getProducts().addAll(Arrays.asList(product01, product03));
		category02.getProducts().addAll(Arrays.asList(product02));
		product01.getCategories().addAll(Arrays.asList(category01));
		product02.getCategories().addAll(Arrays.asList(category01, category02));
		product03.getCategories().addAll(Arrays.asList(category01));
		this.categoryRepository.saveAll(Arrays.asList(category01, category02));
		this.productRepository.saveAll(Arrays.asList(product01, product02, product03));
		State state01 = new State(null, "Minas Gerais");
		State state02 = new State(null, "São Paulo");
		City city01 = new City(null, "Uberlândia", state01);
		City city02 = new City(null, "São Paulo", state02);
		City city03 = new City(null, "Campinas", state02);
		state01.getCities().addAll(Arrays.asList(city01));
		state02.getCities().addAll(Arrays.asList(city02, city03));
		this.stateRepository.saveAll(Arrays.asList(state01, state02));
		this.cityRepository.saveAll(Arrays.asList(city01, city02, city03));
	}

}
