package com.bookStore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MyBooks") 
public class MyBookList {

	@Id
	@Column(name = "book_id")
	
	private int id;
	private String name;
	private String author;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	private Double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public MyBookList(int i, String string, String string2, String string3) {
		super();
		
	}
	
	public MyBookList(int id, String name,String author, Double price) {
		super();
		this.id = id;
		this.name = name;
		 this.author = author;
		this.price = price;
	}
}
