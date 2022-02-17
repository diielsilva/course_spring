package com.dev.course_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.course_spring.domains.City;

public interface CityRepository extends JpaRepository<City, Integer>{

}
