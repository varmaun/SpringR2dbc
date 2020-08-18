package com.springwebflux.r2dbc.dao;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.springwebflux.r2dbc.model.Employee;

import reactor.core.publisher.Flux;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Integer> {
	@Query("{ 'name': ?0 }")
	Flux<Employee> findByName(final String name);
}