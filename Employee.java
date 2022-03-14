package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private String id;
	private String name;
	private String num;
	
	 
	public Employee() {
		super();
	}
	public Employee(String id, String name, String num) {
		super();
		this.id = id;
		this.name = name;
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
}