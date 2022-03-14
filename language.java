package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Language {
	
	@Id
	private String id;
	private String languagename;
	private String concepts;
	
	@ManyToOne
	private Employee employee;
	
	
	public Language() {
		super();
	}
	public Language(String id, String languagename, String concepts,String employeeId) {
		super();
		this.id = id;
		this.languagename = languagename;
		this.concepts = concepts;
		this.employee = new Employee(employeeId,"","");
	}
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getlanguagename() {
		return languagename;
	}
	public void setlanguagename(String languagename) {
		this.languagename = languagename;
	}
	public String getConcepts() {
		return concepts;
	}
	public void setConcepts(String concepts) {
		this.concepts = concepts;
	}
	
	
	
}