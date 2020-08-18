package com.springwebflux.r2dbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springwebflux.r2dbc.dao.EmployeeRepository;
import com.springwebflux.r2dbc.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
 
@Service
public class EmployeeService implements IEmployeeService {
     
    @Autowired
    EmployeeRepository employeeRepo;
 
    public Mono<Employee> create(Employee e) {
      Mono<Employee> emp =  employeeRepo.save(e);
        return emp;
    }
 
    public Mono<Employee> findById(Integer id) {
        return employeeRepo.findById(id);
    }
 
    public Flux<Employee> findByName(String name) {
        return employeeRepo.findByName(name);
    }
 
    public Flux<Employee> findAll() {
        return employeeRepo.findAll();
    }
 
    public Mono<Employee> update(Employee e) {
        return employeeRepo.save(e);
    }
 
    public Mono<Void> delete(Integer id) {
        return employeeRepo.deleteById(id);
    }
 
}