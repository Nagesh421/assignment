package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Language;



public interface LanguageRepository extends CrudRepository<Language, String>{

	 public List<Language>  findByEmployeeId(String employeeId);
}