package com.dev.course_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.course_spring.domains.State;

public interface StateRepository extends JpaRepository<State, Integer>{

}
