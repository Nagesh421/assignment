package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Employee;


public interface Employeerepository extends CrudRepository<Employee, String>{

}