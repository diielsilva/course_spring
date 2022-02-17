package com.dev.course_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.course_spring.domains.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
