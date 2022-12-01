package com.springrestpractice.springrestpractice;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {

	@Id
	private long Id;
	private String name;
	private String description;
	
	
	@Override
	public String toString() {
		return "Product [Id=" + Id + ", name=" + name + ", description=" + description + "]";
	}


	public long getId() {
		return Id;
	}


	public void setId(long id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(long id, String name, String description) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
	}
}
