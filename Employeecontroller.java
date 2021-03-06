package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;
import com.example.demo.service.Employeeservice;



@RestController
public class Employeecontroller {
	@Autowired
	Employeeservice employeeService;
	
	@RequestMapping("/employee")
	public List<Employee> getall(){
		return employeeService.getallemployees();
	}
	
	 @RequestMapping("/employee/{foo}")
	 public Employee getEmployee(@PathVariable("foo") String id) {
	        return employeeService.getreqemployee(id);
	    }
	 
	 @RequestMapping(method =RequestMethod.POST,value="/employee")
	 public void addEmployee(@RequestBody Employee employee) {
		 employeeService.addEmployee(employee);
		 
	    }
	 
	 @RequestMapping(method =RequestMethod.PUT,value="/employee/{id}")
	 public void updateEmployee(@RequestBody Employee employee,@PathVariable String id) {
		 employeeService.updateEmployee(id, employee);
		 
	    }
	 @RequestMapping(method =RequestMethod.DELETE,value="/employee/{id}")
	 public void updateEmployee(@PathVariable String id) {
		 employeeService.deleteEmployee(id);
	    }
}